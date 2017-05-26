function goodsDisplayLog(pos,type,goods_no,recipe_no)
{
    $.ajax({
        type: "GET",
        url: "/goods/ajax.html",
        data: "q_mode=addGoodsDisplayLog&pos="+pos+"&goods_no="+goods_no+"&type=" + type + "&recipe_no=" + recipe_no,
        success: function() {
        }
    });
}

function goodsLog(mode,pos,type,goods_no,recipe_no,q_from)
{
    $.ajax({
        type: "GET",
        url: "/goods/ajax.html",
        data: "q_mode="+mode+"&pos="+pos+"&goods_no="+goods_no+"&type=" + type + "&recipe_no="+recipe_no + "&q_from="+q_from,
        success: function() { }
    });
}

function clickShop(seq)
{
    $.ajax({
        type: "GET",
        url: "/goods/ajax.html",
        data: "q_mode=click&seq="+seq,
        success: function(result) {}
    });
}

function bannerLog(type,banner_no)
{
    $.ajax({
        type: "GET",
        url: "/brand/ajax.html",
        data: "q_mode=addBannerLog&pos=mweb&banner_no="+banner_no+"&type=" + type,
        success: function() { }
    });
}

function shoppingLog(mode,pos,type,goods_no)
{
    $.ajax({
        type: "GET",
        url: "/shopping/ajax.html",
        data: "q_mode="+mode+"&pos="+pos+"&goods_no="+goods_no+"&type=" + type,
        success: function() { }
    });
}