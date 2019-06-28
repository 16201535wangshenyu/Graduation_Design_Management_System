/*学生点击导航栏功能，改变导航栏样式*/


$(document).ready(function(){

    /*个人信息管理*/
    $(".nav_each1_line1").click(function () {
        $(".nav_each1_line1").attr('class','nav_each1_line1 on');
        $(".nav_each1_line2").attr('class','nav_each1_line2');
    });
    $(".nav_each1_line2").click(function () {
        $(".nav_each1_line1").attr('class','nav_each1_line1');
        $(".nav_each1_line2").attr('class','nav_each1_line2 on');
    })

    /*课题管理*/
    $(".nav_each2_line1").click(function () {
        $(".nav_each2_line1").attr('class','nav_each2_line1 on');
        $(".nav_each2_line2").attr('class','nav_each2_line2');
        $(".nav_each2_line3").attr('class','nav_each2_line3');
        $(".nav_each2_line4").attr('class','nav_each2_line4');
        $(".nav_each2_line5").attr('class','nav_each2_line5');
    });
    $(".nav_each2_line2").click(function () {
        $(".nav_each2_line1").attr('class','nav_each2_line1');
        $(".nav_each2_line2").attr('class','nav_each2_line2 on');
        $(".nav_each2_line3").attr('class','nav_each2_line3');
        $(".nav_each2_line4").attr('class','nav_each2_line4');
        $(".nav_each2_line5").attr('class','nav_each2_line5');
    });
    $(".nav_each2_line3").click(function () {
        $(".nav_each2_line1").attr('class','nav_each2_line1');
        $(".nav_each2_line2").attr('class','nav_each2_line2');
        $(".nav_each2_line3").attr('class','nav_each2_line3 on');
        $(".nav_each2_line4").attr('class','nav_each2_line4');
        $(".nav_each2_line5").attr('class','nav_each2_line5');
    });
    $(".nav_each2_line4").click(function () {
        $(".nav_each2_line1").attr('class','nav_each2_line1');
        $(".nav_each2_line2").attr('class','nav_each2_line2');
        $(".nav_each2_line3").attr('class','nav_each2_line3');
        $(".nav_each2_line4").attr('class','nav_each2_line4 on');
        $(".nav_each2_line5").attr('class','nav_each2_line5');
    });
    $(".nav_each2_line5").click(function () {
        $(".nav_each2_line1").attr('class','nav_each2_line1');
        $(".nav_each2_line2").attr('class','nav_each2_line2');
        $(".nav_each2_line3").attr('class','nav_each2_line3');
        $(".nav_each2_line4").attr('class','nav_each2_line4');
        $(".nav_each2_line5").attr('class','nav_each2_line5 on');
    });


    /*教师任务管理*/
    $(".nav_each3_line1").click(function () {
        $(".nav_each3_line1").attr('class','nav_each3_line1 on');
        $(".nav_each3_line2").attr('class','nav_each3_line2');
        $(".nav_each3_line3").attr('class','nav_each3_line3');
        $(".nav_each3_line4").attr('class','nav_each3_line4');
    });
    $(".nav_each3_line2").click(function () {
        $(".nav_each3_line1").attr('class','nav_each3_line1');
        $(".nav_each3_line2").attr('class','nav_each3_line2 on');
        $(".nav_each3_line3").attr('class','nav_each3_line3');
        $(".nav_each3_line4").attr('class','nav_each3_line4');
    });
    $(".nav_each3_line3").click(function () {
        $(".nav_each3_line1").attr('class','nav_each3_line1');
        $(".nav_each3_line2").attr('class','nav_each3_line2');
        $(".nav_each3_line3").attr('class','nav_each3_line3 on');
        $(".nav_each3_line4").attr('class','nav_each3_line4');
    });
    $(".nav_each3_line4").click(function () {
        $(".nav_each3_line1").attr('class','nav_each3_line1');
        $(".nav_each3_line2").attr('class','nav_each3_line2');
        $(".nav_each3_line3").attr('class','nav_each3_line3');
        $(".nav_each3_line4").attr('class','nav_each3_line4 on');
    });



    /*查看公告*/
    $(".nav_each4_line1").click(function () {
        $(".nav_each4_line1").attr('class','nav_each4_line1 on');
    });


    /*选择愿带学生*/
    $(".nav_each5_line1").click(function () {
        $(".nav_each5_line1").attr('class','nav_each5_line1 on');

    });


    /*答辩过程管理*/
    $(".nav_each6_line1").click(function () {
        $(".nav_each6_line1").attr('class','nav_each6_line1 on');
        $(".nav_each6_line2").attr('class','nav_each6_line2');
        $(".nav_each6_line3").attr('class','nav_each6_line3');
        $(".nav_each6_line4").attr('class','nav_each6_line4');
    });
    $(".nav_each6_line2").click(function () {
        $(".nav_each6_line1").attr('class','nav_each6_line1');
        $(".nav_each6_line2").attr('class','nav_each6_line2 on');
        $(".nav_each6_line3").attr('class','nav_each6_line3');
        $(".nav_each6_line4").attr('class','nav_each6_line4');
    });
    $(".nav_each6_line3").click(function () {
        $(".nav_each6_line1").attr('class','nav_each6_line1');
        $(".nav_each6_line2").attr('class','nav_each6_line2');
        $(".nav_each6_line3").attr('class','nav_each6_line3 on');
        $(".nav_each6_line4").attr('class','nav_each6_line4');
    });
    $(".nav_each6_line4").click(function () {
        $(".nav_each6_line1").attr('class','nav_each6_line1');
        $(".nav_each6_line2").attr('class','nav_each6_line2');
        $(".nav_each6_line3").attr('class','nav_each6_line3');
        $(".nav_each6_line4").attr('class','nav_each6_line4 on');
    });
});