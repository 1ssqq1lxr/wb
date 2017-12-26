var _hmt = _hmt || [];
(function() {
    var hm = document.createElement("script");
    hm.src = "https://hm.baidu.com/hm.js?7894b6af32428f8bf3fec1a9bccceb32";
    var s = document.getElementsByTagName("script")[0];
    s.parentNode.insertBefore(hm, s);
})();

var sub = false;
var app = {

    modal: {
        open: function(opt) {
            $('#' + opt).show();
        },
        close: function(opt) {
            $('#' + opt).hide();
        }
    },

    submitOrder: function(type) {
        if (sub) {
            alert('您的资料已经提交，请稍候');
            return;
        }
        var cellPhone = $('#cellPhone');
        var nickname = $('#nickname');
        var business = $('#business');
        var projectType = $('#projectType .current').text();
        var comments = $('#comment');
        var mobileReg = /^0?1[3|4|5|7|8][0-9]\d{8}$/;
        var url = 'http://www.yunwoke.com/mail/smtp.php';
        if (nickname.val() === '') {
            return alert('请输入您的昵称');
        }
        if (cellPhone.val() === '') {
            return alert('请输入您的手机号码');
        }
        if (!mobileReg.test(cellPhone.val())) {
            return alert('手机号码格式不正确，请重新输入');
        }
        if (business.val() === '0') {
            return alert('请选择产品所属行业');
        }
        var foo = {
            cellPhone: cellPhone.val(),
            nickname: nickname.val(),
            business: business.val(),
            projectType: projectType,
            comments: comments.val()
        }
        sub = true;
        $.post(url, foo, function(json) {
            //	var result = JSON.parse(json);

            if (json.status !== 100) {
                return alert(result.message);
            }
            alert('提交成功');
            location.reload();
        })
    }
}

$('#menu').click(function() {
    $(this).toggleClass('current');
    $('body').toggleClass('current');
    $('.m_menu').toggle();
})

$('#projectType span').on('click', function() {
    $(this).addClass('current').siblings().removeClass('current');
})
var wAlert = window.alert;
window.alert = function(message) {
    try {
        var iframe = document.createElement('IFRAME');
        iframe.style.display = 'none';
        iframe.setAttribute('src', 'data:text/plain,');
        document.documentElement.appendChild(iframe);
        var alertFrame = window.frames[0];
        var iwindow = alertFrame.window;
        if (iwindow == undefined) {
            iwindow = alertFrame.contentWindow;
        }
        iwindow.alert(message);
        iframe.parentNode.removeChild(iframe);
    } catch (exc) {
        return wAlert(message);
    }
};