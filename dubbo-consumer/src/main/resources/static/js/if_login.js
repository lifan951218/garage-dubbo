// 获取cookie值(key)
function getCookie(cname)
{
    var name = cname + "=";
    var ca = document.cookie.split(';');
    for(var i=0; i<ca.length; i++)
    {
        var c = ca[i].trim();
        if (c.indexOf(name)==0) return c.substring(name.length,c.length);
    }
    return "";
}

var $ticket= getCookie("ticket");
var datas={
    ticket:$ticket
};
console.log($ticket);

$(function(){
    //console.log($ticket);
    if($ticket != ""){
        var datas = {
            ticket: $ticket
        };
        //判断ticket是否有效
        $.ajax({
            url: '/member/ifTicket',
            type: 'post',
//          dataType: 'json',
            data: datas,
            success: function (json) {
                console.log(json);
                if (json == "0") {
                    window.location.href = 'signin.html';//未登录跳转到登录界面
                }
            },
            error: function () {
                alert('false');
            }
        })
    }else{
        window.location.href = 'signin.html';//未登录跳转到登录界面
    }
});


function logout(){
    $.ajax({
        url: '/member/logout',
        type: 'post',
//                            dataType: 'json',
        //data: datas,
        success: function (json) {
            console.log(json);
            if (json == "1") {
                window.location.href = 'signin.html';//注销成功跳转
            }
        },
        error: function (XMLHttpRequest, textStatus, errorThrown) {
            console.log(XMLHttpRequest);
            console.log(textStatus);
            console.log(errorThrown);
        }
    })
}

//添加用户名到页面
var $username = localStorage.getItem("username");
$("#username").html($username);



