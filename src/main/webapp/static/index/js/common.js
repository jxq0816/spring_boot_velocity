/*$(function () {
    $('.navBar li').hover(function(){
        $(this).addClass('selfColor').siblings('li').removeClass('selfColor');
    })
})*/

function moreInfo() {
    $(".userinfo").addClass("userinfos");
    $(".menu").toggleClass("menus");
}
function userInfo() {
    $(".menu").addClass("menus");
    $(".userinfo").toggleClass("userinfos");
}
function show_scenic(e){
    if (e.stopPropagation)
        e.stopPropagation();
    else
        e.cancelBubble = true;
};
