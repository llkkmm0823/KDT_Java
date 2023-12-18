jQuery(document).ready(function() {

    $('.navi>li').mouseover(function() {
        $(this).find('.submenu').stop().slideDown(500);
    }).mouseout(function() {
        $(this).find('.submenu').stop().slideUp(500);
    });

    setInterval (function() {
        $('.slidelist').delay(2000);
        $('.slidelist').animate({marginLeft : -1000});
        $('.slidelist').delay(2000);
        $('.slidelist').animate({marginLeft : -2000});
        $('.slidelist').delay(2000);
        $('.slidelist').animate({marginLeft : 0});
        $('.slidelist').delay(2000);
    });
    
    $('.nextbtn').click(function() {
        $('.multislidelist').animate({marginLeft : '-=340'});
    });
    $('.prevbtn').click(function() {
        $('.multislidelist').animate({marginLeft : '+=340'});
    });
});