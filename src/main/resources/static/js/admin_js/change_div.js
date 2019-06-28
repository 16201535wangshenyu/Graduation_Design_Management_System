/**
 * 根据点击导航栏切换div
 */
$(document).ready(function () {
    $(".main").find("iframe").hide();//先隐藏所有p元素

    $("ul li").click(function () {
        var id = $(this).attr("id");//获取别点击导航栏的id
        var line_id = id.slice(4);//功能子下标
        var showId = $(".main").find("iframe").eq((line_id-1)).attr('id');//获取对应的iframe的id

        showId = '#'+showId;
        var contentDiv= $(showId);
        contentDiv.show();//将导航栏对应的div显示出来

        var p = $(contentDiv.get(0).parentNode.children);//获取父级所有子集元素
        for(var i =0,pl= p.length;i<pl;i++) {
            if(!($(p[i]).is(contentDiv)) ){ //剔除自己
                /*alert(p[i]);
                alert(contentDiv);*/
                $(p[i]).hide(); //将同级别的兄弟累剔除
            }
        }


    })
})