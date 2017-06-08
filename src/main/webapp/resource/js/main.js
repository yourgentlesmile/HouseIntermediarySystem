function request(object,method,methodURL,successFunction){ 
	$.ajax({
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
        var name = "<th>"+"<a>"+data[i].housesName+"</a>"+"</th>";
        var area = "<th>"+data[i].housesArea+"</th>";
        var price = "<th>"+data[i].housesPrice+"</th>";
        var clientTel = "<th>"+data[i].clientTelephone+"</th>";
        var time ="<th>"+data[i].housesOpentime+"</th>";
        var employee = "<th>"+data[i].employeeList+"</th>";
        selector.append("<tr>"+id+name+area+price+clientTel+time+employee);
    }
};

function refreshContractList(data){
	var selector = $("#contractlist").find("#list1").find("#listbody");
    selector.html("");
    for(var i=0;i<data.length;i++){
    	
    	var id = "<th>"+(i+1)+"</th>";
        var name = "<th>"+"<a>"+data[i].housesName+"</a>"+"</th>";
        var clientname = "<th>"+data[i].clientName+"</th>";
        {
        	var oldTime=(new Date(data[i].signtime).getTime());
        	var newTime=new Date(oldTime);
        	var year = newTime.getFullYear();
        	var month= newTime.getMonth()+1;
        	var day =newTime.getDate();
        	var hours=newTime.getHours();
        	var minute=newTime.getMinutes();
        	var second=newTime.getSeconds();
        	}
        var time="<th>"+(year+"/"+month+"/"+day+" "+hours+":"+minute+":"+second)+"</th>";
        var employee = "<th>"+data[i].employeeName+"</th>";
        var detail = "<th>"+"<button id="+"data_"+(i+1)+" data-id=\""+data[i].contractId+"\">详情"+"</button>";
        var delet = "<th>"+"<button id="+"delete_"+(i+1)+" data-id=\""+data[i].contractId+"\" data-name=\""+data[i].employeeName+"\">通过"+"</button>";
        /*if(data[i].employeeName=="阿梅利亚"){
        	selector.append("<tr>"+id+name+clientname+time+employee+detail+delet);
        }*/
        selector.append("<tr>"+id+name+clientname+time+employee+detail+delet);
        var data_num="#data_"+(i+1);
        var delete_num="#delete_"+(i+1);
        $(data_num).click(function(){
        	var contractid = $(this).attr("data-id");
        	request(null, "GET", "Contract/none/list/3/"+contractid, refreshDetailList);
        	$("#dialog").dialog({
        		width:900,
        		height:500,
        		modal: true
        	});
        });
        $(delete_num).click(function(){
        	var contractid = $(this).attr("data-id");
        	var employeename=$(this).attr("data-name");
        	var achivement=new Object();
        	achivement.contractId=contractid;
        	achivement.employeeName=employeename;
        	request(achivement, "POST", "Achivement/updateContract", function(){
        		request(null,"GET","Contract/none/list/4/1",refreshContractList);
        	});
        });
    }
};

function refreshDetailList(data){
	 var selector_2 =$("#dialog").find("#detaillist").find("#detailbody");
	 selector_2.html("");
	 for(var i=0;i<data.length;i++){
	        var name = "<th>"+"<a>"+data[i].housesName+"</a>"+"</th>";
	        var clientname = "<th>"+data[i].clientName+"</th>";
	        
        	var oldTime=(new Date(data[i].signtime).getTime());
        	var newTime=new Date(oldTime);
        	var year = newTime.getFullYear();
        	var month= newTime.getMonth()+1;
        	var day =newTime.getDate();
        	var hours=newTime.getHours();
        	var minute=newTime.getMinutes();
        	var second=newTime.getSeconds();
        	
	        var time="<th>"+(year+"/"+month+"/"+day+" "+hours+":"+minute+":"+second)+"</th>";
	        var employee = "<th>"+data[i].employeeName+"</th>";
	        var area ="<th>"+ data[i].housesArea+"</th>";
	        var price ="<th>"+ data[i].housesPrice+"</th>";
	        var intentiongold="<th>"+ data[i].intentionGold+"</th>";
	        var dealgold="<th>"+data[i].dealGold+"</th>";
	        var clientid="<th>"+data[i].clientId+"</th>";
	        selector_2.append("<tr>"+name+area+price+intentiongold+dealgold+clientname+clientid+time+employee);
	 }
};

function CreateContract(){
	var contract=new Object();
	contract.housesName = $("#newHousesname").val();
	
	contract.housesArea = parseFloat($("#newHousesarea").val());
	contract.housesPrice= parseFloat($("#newHousesprice").val());
	contract.intentionGold=parseInt($("#newIntentiongold").val());
	contract.dealGold=parseInt($("#newDealgold").val());
	contract.clientName=$("#newClientname").val();
	var now =new Date().getTime();
	contract.signtime=now;
	contract.employeeName=$("#newEmployeename").val();
	contract.clientId="1";
	contract.contractId=null;
	contract.clientSex=null;
	
	var houses=new Object();
	houses.housesName=contract.housesName;
	houses.housesId=null;
	houses.clientTelephone=null;
	houses.housesOpentime=null;
	houses.dealHistory=null;
	houses.employeeList=null;
	houses.housesArea=null;
	houses.housesPrice=null;
	request(houses,"POST","Achivement/deleteHouseInfo?type=2",refreshHouseList);
	
	request(contract,"POST", "Contract/none/add",function(){
		request(null,"GET","Contract/none/list/4/1",refreshContractList);
	});
	
	
};

function DeleteContract(a){
	var contract = new Object();
	contract.contractId=a;
	contract.housesName = null;
	contract.housesArea = null;
	contract.housesPrice= null;
	contract.intentionGold=null;
	contract.dealGold=null;
	contract.clientName=null;
	contract.signtime=null;
	contract.employeeName=null;
	contract.clientId=null;
	contract.clientSex=null;
	//request(contract, "POST", "Contract/none/delete", isDelete);
	
	
};

function isDelete(a){
	if(a==1){
		request(null,"GET","Contract/none/list/4/1",refreshContractList);
	}
	else{
		alert("删除失败");
	}
}

function refreshBlackList(data){
	var selector = $("#blacklist").find("#list1").find("#listbody");
	selector.html("");
    for(var i=0;i<data.length;i++){
    	
    	var id = "<th>"+(i+1)+"</th>";
    	var clientid = "<th>"+data[i].clientId+"</th>";
        var clientname = "<th>"+data[i].clientName+"</th>";
        var description="<th>"+data[i].description+"</th>";
        var oldTime=(new Date(data[i].time).getTime());
        
        var newTime=new Date(oldTime);
        var year = newTime.getFullYear();
        var month= newTime.getMonth()+1;
        var day =newTime.getDate();
        var hours=newTime.getHours();
        var minute=newTime.getMinutes();
        var second=newTime.getSeconds();
        
        var thetime="<th>"+(year+"/"+month+"/"+day+" "+hours+":"+minute+":"+second)+"</th>";
        var delet = "<th>"+"<button id="+"deleteblack_"+(i+1)+" data-id=\""+data[i].id+"\">删除"+"</button>";
        selector.append("<tr>"+id+clientname+clientid+description+thetime+delet);
        var delete_num ="#deleteblack_"+(i+1);
        $(delete_num).click(function(){
        	var id = $(this).attr("data-id");
        	DeleteBlackList(id);
        });
    }
};

function CreateBlackList(){
	var blacklist= new Object();
	blacklist.id=null;
	blacklist.clientName=$("#newClientName").val();
	blacklist.clientId=$("#newClientId").val();
	blacklist.description=$("#newDescription").val();
	blacklist.time=new Date().getTime();
	request(blacklist,"POST","BlackList/add",function(){
		request(null,"GET","BlackList/query/2/1",refreshBlackList);
	});
};

function DeleteBlackList(a){
	var blacklist=new Object();
	blacklist.id=a;
	blacklist.clientName=null;
	blacklist.clientId=null;
	blacklist.description=null;
	blacklist.time=null;
	request(blacklist,"POST","BlackList/delete",isDeleteBlackList);
};

function isDeleteBlackList(a){
	if(a==1){
		request(null,"GET","BlackList/query/2/1",refreshBlackList);
	}
	else{
		alert("删除失败!");
	}
}