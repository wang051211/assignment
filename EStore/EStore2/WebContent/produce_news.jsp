<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>

  <style type="text/css"">
    .img_change{
         width:630px;
	     height:250px;
    }

  </style>
  <script type="text/javascript">
    var imglist=new Array(6)
   imglist[0]="images/screen1.jpg";  
   imglist[1]="images/screen2.jpg";
   imglist[2]="images/screen3.jpg";
   imglist[3]="images/screen4.jpg";
   imglist[4]="images/screen5.jpg";
   imglist[5]="images/screen6.jpg";
  var i=0;
  function changeimg()
 {
      if(i==imglist.length)
      {
          i=0;
      }
 document.getElementById("tp").src=imglist[i];
 ++i;
}
   window.setInterval("changeimg()",2000)

</script>

</head>
<body  onload="changeimg()">
  <img src="images/screen1.jpg" name="tp" id="tp" width="620px"
	   height="230px"></img>

</body>
</html>