<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head lang="en">
<meta charset="UTF-8">
<title></title>
</head>
<body>

	<script src="//code.jquery.com/jquery-1.11.0.min.js">
		//jquery를 사용하겠다고 선언하는 것.
	</script>

<div class = "target">
<li>hi</li>
</div>
	<script>

		var target = $(".target");
		$.getJSON("list", function(data) {
			var items = [];
			$.each(data, function(key, val) {
				console.log(key, val);

				items.push("<li key='" + key + "'data-type='" + val.bno + "'>"
						+ val.bno + ":" + val.title + "</"+"li>");
			});
			$("<ul/>",{
				"class": "line",
				html: items.join("")
			}).appendTo(target);
		});
	</script>


</body>
</html>