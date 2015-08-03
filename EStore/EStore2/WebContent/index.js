// JavaScript Document
$(document).ready(function(){ 
//初始化页面内容
	initIndex();
	//鼠标移过商品分类
	$("#sellSort").bind("mouseover",function(){
		$("#sellSortUl").css("display","block");
	});
	$("#detailLi").mouseover(function() {
		$("#sellSortLi").css("display","block");
        
    }).mouseout(function() {
        $("#sellSortLi").css("display","none");
		$("#sellSortUl").css("display","none");
    });
	$("#sellSortUl").mouseout(function() {
        $(this).css("display","none");
    });
		
});
//初始化页面内容
function initIndex(){
	var n =0;
	showIdeaBlock();
	//图片轮播
	startMove();
	var timer = null;
	function startMove()
	{
		clearInterval(timer);
		var image = document.getElementById("img");
		timer = setInterval(function(){
			n++;
			if( n==7)
				n=1;
			image.src="images/screen" +parseInt(n)+ ".jpg";
		},2000);
	}
}

//测试数据
{
  var jsonBlock = {
    Block:[
      {
        image: "images/pic1.jpg",
        title: "保温水杯",
        price: "价格:￥139",
        sell: "速速抢购"
      },
       {
        image: "images/pic2.jpg",
        title: "黑宝石手链",
        price: "价格:￥139",
        sell: "速速抢购"
      },
	   {
        image: "images/pic3.jpg",
        title: "LV名牌包包",
        price: "价格:￥139",
        sell: "速速抢购"
      },
	    {
        image: "images/pic4.jpg",
        title: "名牌夹克",
        price: "价格:￥139",
        sell: "速速抢购"
      },
	   {
        image: "images/pic5.jpg",
        title: "大容量冰箱",
        price: "价格:￥139",
        sell: "速速抢购"
      },
	    {
        image: "images/pic6.jpg",
        title: "可爱的挂链",
        price: "价格:￥139",
        sell: "速速抢购"
      },
	   {
        image: "images/pic6.jpg",
        title: "可爱的挂链",
        price: "价格:￥139",
        sell: "速速抢购"
      },
    ]
  }
  
//显示推荐人块中的内容
function showIdeaBlock(){
	var j = 0;
	while(j<10){
		for(var i in jsonBlock.Block){
    	var imagel = jsonBlock.Block[i].image;
   		var titlel = jsonBlock.Block[i].title;
 	    var pricel = jsonBlock.Block[i].price;
    	var selll = jsonBlock.Block[i].sell;
		var index = i;
		//创建推荐人块
    	createBlock(imagel,titlel,pricel,selll,index);
		j++;
  }
}
}
}
//创建商品块
 function  createBlock(imagel,titlel,pricel,selll,index){
	//创建div
	var leftBottom = document.getElementById("leftBottom");
	var block = document.createElement("div");
	$(block).addClass("sellDiv");
	//创建标题p
	var title = document.createElement("p");
	$(title).addClass("sellP");
	$(title).append(titlel);
	block.appendChild(title);
	//创建图片
	var img = document.createElement("img");
	$(img).addClass("sellImg");
	$(img).attr("src",imagel);
	block.appendChild(img);
	
	//创建价格span
	var price = document.createElement("span");
	$(price).addClass("sellSpan");
	$(price).append(pricel);
	block.appendChild(price);
	//创建抢购span
	var sell = document.createElement("span");
	$(sell).addClass("sellSpan");
	$(sell).append(selll);
	block.appendChild(sell);
	leftBottom.appendChild(block);
}

