<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head lang="en">
<meta charset="UTF-8">
<title></title>
</head>
<body>



<div class="row">
                        <div class="col-xs-12">
                            <div class="box">
                                <div class="box-header">
                                    <h3 class="box-title">Responsive Hover Table</h3>
                                    <div class="box-tools">
                                        <div class="input-group">
                                            <input type="text" name="table_search" class="form-control input-sm pull-right" style="width: 150px;" placeholder="Search">
                                            <div class="input-group-btn">
                                                <button class="btn btn-sm btn-default"><i class="fa fa-search"></i></button>
                                            </div>
                                        </div>
                                    </div>
                                </div><!-- /.box-header -->
                                <div class="box-body table-responsive no-padding">
                                    <table class="target">
                                        </table>
                                </div><!-- /.box-body -->
                            </div><!-- /.box -->
                        </div>
                    </div>


	<script src="//code.jquery.com/jquery-1.11.0.min.js">
		//jquery를 사용하겠다고 선언하는 것.
	</script>

	<script>

		var target = $(".target");
		$.getJSON("list", function(data) {
			var items = [];
			
			items.push("<tr>");
			items.push("<td><b>bno"+"</td>");
			items.push("<td><b>title"+"</td>");
			items.push("<td><b>userid"+"</td>");
			items.push("<td><b>regdate"+"</td>");
			
			items.push("</tr>");
			
			$.each(data, function(key, val) {
				console.log(key, val);

				items.push("<tr>");
	
				items.push("<td key='" + key + "'data-type='" + val.bno + "'>"
						+ val.bno + "</td>");
				items.push("<td key='" + key + "'data-type='" + val.bno + "'>"
						+ "<a href='read?bno="+val.bno+"'>"+ val.title +"</a></td>");
				items.push("<td key='" + key + "'data-type='" + val.bno + "'>"
						+ val.userid + "</td>");
				items.push("<td key='" + key + "'data-type='" + val.bno + "'>"
						+ val.regdate + "</td>");
			
				items.push("</tr>");
			});
			$("<list/>",{
				"class": "line",
				html: items.join("")
			}).appendTo(target);
		});
	</script>


</body>
</html>