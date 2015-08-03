<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>EStore购物商城</title>

<link rel="stylesheet" href="style.css" type="text/css" media="screen" />

<script type="text/javascript" src="jQuery1.7.1.js"></script>

<script type="text/javascript">
$(document).ready(function(){ 
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

</script>

</head>
<body>
  <div class="div_body"  style="margin-top:80px;">
      <div class="header">
	       <div style="position:absolute;float:left;margin-left:11px;margin-top:9px;">
		       <span style="position:absolute;z-index:1;font-size:12px;">欢迎来到EStore购物商城！
		          <a href="login.jsp" class="div_a" style="position:absolute;width:100px;z-index:1;">[登录]</a>
			      <a href="" class="div_a" style="position:absolute;float:left;margin-left:40px;width:100px;z-index:1;">[免费注册]</a>
			      <a href="" class="div_a" style="position:absolute;float:left;margin-left:105px;width:100px;z-index:1;">[退出]</a>
			      <h1 style="font-size:35px;margin-top:50px;" >EStore购物商城</h1>
			      <div  style="font-size:20px;margin-top:-20px;">快乐的购物天堂...</div>
		       </span>
               <input type="image" src="images\header.jpg" width="875px" height="205px"></input>
            </div>  
	  </div>
	  <div class="firstBody">
	        <a class="div_tr1"style="margin-left:11px;">主页</a>
		    <a class="div_tr1"style="margin-left:120px" id="sellSort">商品分类
			   
			    <ul id="sellSortUl" class="sellSort" style="display:none;">
                    	<li class="sellSortLi">&nbsp;&nbsp;图书、电子书刊、音像</li>
                        <li id="detailLi" class="sellSortLi">&nbsp;&nbsp;电子数码
                        	<ul class="sellSort sellSortUl" id="sellSortLi" style="display:none;">
                            	<li class="sellSortLi">&nbsp;&nbsp;家用电器</li>
                                <li class="sellSortLi">&nbsp;&nbsp;手机数码</li>
                                <li class="sellSortLi">&nbsp;&nbsp;电脑、办公</li>
                            </ul>
                        </li>
                        <li class="sellSortLi">&nbsp;&nbsp;家居、家具、家装、厨具</li>
                 </ul>
			</a>
            <a class="div_tr1"style="margin-left:230px">关于我们</a>
	  </div>
	  <div class="SecondBody">
	      <div class="sale1">
		      <div class="sale1_m">
		          <div class="sale1_m1">商品促销信息</div>
			      <div class="sale1_m2">
	                     <%@include file="produce_news.jsp" %> 
				  </div>      
              </div>
		  </div>
		  <div class="sale2">
		        <div class="sale2_m">
				     <div class="sale1_m1">热卖商品销售中</div>
					 <div class="sale2_m1">更多商品...</div>
                     <div class="sale2_tr1">
					     <div class="sale2_m2" style="float:left;">
					         <div style="margin-left:15px;">
					               <h4>保温水杯</h4>
                                   <img src="images\pic1.jpg" width="55px" height="55px"/>
                                   <p>价格: ￥139</p>
						           <p style="margin-top:-8px;">速速抢购</p>
                             </div>
					     </div>
					     <div class="sale2_m2" style="float:left;">
					          <div style="margin-left:15px;">
					               <h4>黑宝石手链</h4>
                                   <img src="images\pic2.jpg" width="55px" height="55px"/>
						           <p>价格: ￥139</p>
						           <p style="margin-top:-8px;">速速抢购</p>
                              </div>
					     </div>
					     <div class="sale2_m2" style="float:left;">
					           <div style="margin-left:15px;">
					                <h4>LV名牌包包</h4>
						            <img src="images\pic3.jpg" width="55px" height="55px"/>
                                    <p>价格: ￥139</p>
						            <p style="margin-top:-8px;">速速抢购</p>
                               </div>
					     </div>
					     <div class="sale2_m2" style="float:left;">
					           <div style="margin-left:15px;">
					                 <h4>名牌夹克</h4>
							         <img src="images\pic4.jpg" width="55px" height="55px"/>
                                     <p>价格: ￥139</p>
							         <p style="margin-top:-8px;">速速抢购</p>
                               </div>
					     </div>
					     <div class="sale2_m2" style="float:left;">
					           <div style="margin-left:15px;">
					                 <h4>大容量冰箱</h4>
							         <img src="images\pic5.jpg" width="55px" height="55px"/>
                                     <p>价格: ￥139</p>
							         <p style="margin-top:-8px;">速速抢购</p>
                               </div>
					      </div>
	                 </div>
					 <div class="sale2_tr1">
					     <div class="sale2_m2" style="float:left;">
					         <div style="margin-left:15px;">
					               <h4>保温水杯</h4>
                                   <img src="images\pic1.jpg" width="55px" height="55px"/>
                                   <p>价格: ￥139</p>
						           <p style="margin-top:-8px;">速速抢购</p>
                             </div>
					     </div>
					     <div class="sale2_m2" style="float:left;">
					          <div style="margin-left:15px;">
					               <h4>黑宝石手链</h4>
                                   <img src="images\pic2.jpg" width="55px" height="55px"/>
						           <p>价格: ￥139</p>
						           <p style="margin-top:-8px;">速速抢购</p>
                              </div>
					     </div>
					     <div class="sale2_m2" style="float:left;">
					           <div style="margin-left:15px;">
					                <h4>LV名牌包包</h4>
						            <img src="images\pic3.jpg" width="55px" height="55px"/>
                                    <p>价格: ￥139</p>
						            <p style="margin-top:-8px;">速速抢购</p>
                               </div>
					     </div>
					     <div class="sale2_m2" style="float:left;">
					           <div style="margin-left:15px;">
					                 <h4>名牌夹克</h4>
							         <img src="images\pic4.jpg" width="55px" height="55px"/>
                                     <p>价格: ￥139</p>
							         <p style="margin-top:-8px;">速速抢购</p>
                               </div>
					     </div>
					     <div class="sale2_m2" style="float:left;">
					           <div style="margin-left:15px;">
					                 <h4>大容量冰箱</h4>
							         <img src="images\pic5.jpg" width="55px" height="55px"/>
                                     <p>价格: ￥139</p>
							         <p style="margin-top:-8px;">速速抢购</p>
                               </div>
					      </div>
						  <div class="sale2_m2" style="float:left;">
					           <div style="margin-left:15px;">
					                 <h4>可爱的挂链</h4>
								     <img src="images\pic6.jpg" width="55px" height="55px"/>
                                     <p>价格: ￥139</p>
									 <p style="margin-top:-8px;">速速抢购</p>
                               </div>
					      </div>
	                 </div>
					 <div class="sale2_tr1">
					     <div class="sale2_m2" style="float:left;">
					         <div style="margin-left:15px;">
					               <h4>保温水杯</h4>
                                   <img src="images\pic1.jpg" width="55px" height="55px"/>
                                   <p>价格: ￥139</p>
						           <p style="margin-top:-8px;">速速抢购</p>
                             </div>
					     </div>
					     <div class="sale2_m2" style="float:left;">
					          <div style="margin-left:15px;">
					               <h4>黑宝石手链</h4>
                                   <img src="images\pic2.jpg" width="55px" height="55px"/>
						           <p>价格: ￥139</p>
						           <p style="margin-top:-8px;">速速抢购</p>
                              </div>
					     </div>
					     <div class="sale2_m2" style="float:left;">
					           <div style="margin-left:15px;">
					                <h4>LV名牌包包</h4>
						            <img src="images\pic3.jpg" width="55px" height="55px"/>
                                    <p>价格: ￥139</p>
						            <p style="margin-top:-8px;">速速抢购</p>
                               </div>
					     </div>
					     <div class="sale2_m2" style="float:left;">
					           <div style="margin-left:15px;">
					                 <h4>名牌夹克</h4>
							         <img src="images\pic4.jpg" width="55px" height="55px"/>
                                     <p>价格: ￥139</p>
							         <p style="margin-top:-8px;">速速抢购</p>
                               </div>
					     </div>
					     <div class="sale2_m2" style="float:left;">
					           <div style="margin-left:15px;">
					                 <h4>大容量冰箱</h4>
							         <img src="images\pic5.jpg" width="55px" height="55px"/>
                                     <p>价格: ￥139</p>
							         <p style="margin-top:-8px;">速速抢购</p>
                               </div>
					      </div>
						  <div class="sale2_m2" style="float:left;">
					           <div style="margin-left:15px;">
					                 <h4>可爱的挂链</h4>
								     <img src="images\pic6.jpg" width="55px" height="55px"/>
                                     <p>价格: ￥139</p>
									 <p style="margin-top:-8px;">速速抢购</p>
                               </div>
					      </div>
	                 </div>

				</div>
		  
		  </div>
	  </div>
	  <div class="thirdBody">
		       <div class="div_menu">
		           <div style="font-weight:bold;">导航菜单</div>
				   <ul>
				     <li><a href="#" class="div_li">主页</a></li>
					 <li><a href="#">添加商品</a></li>
					 <li><a href="#">查看商品</a></li>
					 <li><a href="#">查看购物车</a></li>
					 <li><a href="#">查看订单</a></li>
					 <li><a href="#">关于我们</a></li>
					 <li><a href="#">联系方式</a></li>
				   </ul>
				   <div class="find">
				       <div class="find1">查询商品</div>
					   <input type="text" class="find2"></input>
					   <div class="find3">查询</div>
				   </div>
				   <div class="message">
				        <div class="find1">联系信息</div>
						<input type="image" src="images\contact.jpg" width="195px" height="120px" style="margin-left:12px;margin-top:8px;">
						</input>
						<div style="margin-top:2px;font-size:12px;font-weight:bold;">公司信息</div>
						<div style="margin-top:-10px;font-size:12px;">传智播客</div>
						<div style="margin-top:-10px;font-size:12px;">电子邮箱:
						     <a class="div_a" href="">jyl@itcast.cn</a>
                        </div>
						<div style="margin-top:10px;font-size:12px;">电话：（010）82935150</div>
						<div style="margin-top:-10px;font-size:12px;">传真：（010）82935150</div>
				   </div>
               </div>
			  
	  </div>
	  <div class="bottom">
	       <input type="image" src="images\footer_b.png" width="900px" height="55px" style="border-radius:0px 0px 10px 10px">
		      <input type="image" src="images\rssicon.png" width="25px" height="30px"
			  style="position:absolute;margin-left:-890px;margin-top:10px"></input>
			  <div  style="width:400px;height:50px;position:absolute;z-index:1;margin-top:-50px;margin-left:300px;
			  font-size:13px;">
			      
			      <a href="" class="div_a" style="color:#369696;">关于我们</a>
				         <span>|</span>
				  <a href="" class="div_a" style="color:#369696;">联系我们</a>
				          <span>|</span>
				  <a href="" class="div_a" style="color:#369696;">人才招聘</a>
				          <span>|</span>
				  <a href="" class="div_a" style="color:#369696;">商家入驻</a>
				  <div style="margin-left:20px;font-size:12px;">版权 © 2014 ---. 传智播客 版权所有.</div>

			  </div>
           </input>
		   
	  </div>
  </div>
  
</body>
</html>