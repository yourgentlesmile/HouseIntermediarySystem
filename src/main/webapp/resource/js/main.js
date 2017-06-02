function request(object,method,methodURL,successFunction){ $.ajax({
                        cache: true,
                        type: method,
                        datatype:"json",
                        contentType: "application/json",
                        url:methodURL,
                        data:JSON.stringify(object),
                        error: function(XMLHttpRequest, textStatus, errorThrown) {
                                alert(XMLHttpRequest.status+"\r\n"+XMLHttpRequest.readyState+"\r\n"+textStatus);
                    },
                    success:  successFunction
                    });
                }


function refreshWorkList(data){
            var selector = $("#list").find("#list1").find("#listbody");
            selector.html("");
            for(var i=0;i<data.length;i++){
            	var id = "<th>"+(i+1)+"</th>";
                var name = "<th>"+data[i].userName+"</th>";
                var area = "<th>"+data[i].area+"</th>";
                var achivement = "<th>"+data[i].performanceNow+"</th>";
                var totalAch = "<th>"+data[i].performanceTotal+"</th>";
                var userTel = "<th>"+data[i].telephone+"</th>";
                selector.append("<tr>"+id+name+area+achivement+totalAch+userTel);
            }
        };
 
        function refreshHouseList(data){
        	var selector = $("#houselist").find("#list1").find("#listbody");
                    selector.html("");
                    for(var i=0;i<data.length;i++){
                    	var id = "<th>"+(i+1)+"</th>";
                        var name = "<th>"+data[i].houseName+"</th>";
                        var area = "<th>"+data[i].houseArea+"</th>";
                        var price = "<th>"+data[i].housePrice+"</th>";
                        var clientTel = "<th>"+data[i].clientTelephone+"</th>";
                        var employee = "<th>"+data[i].employeeList+"</th>";
                        selector.append("<tr>"+id+name+area+price+clientTel+employee);
                    }
        }