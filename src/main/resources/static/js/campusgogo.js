$(document).ready(function() {
    $('.full-width-table td').click(function() {
    	if($(this).text()=="") {
    		return;
    	}
    	$(this).toggleClass("fault-td");
    });

    $("select").change(function() {
    	console.log("hidden");
    	$(".alert").addClass('hidden');
    })
    
    $("button").click(analysis);

    function analysis(e) {
    	
    	if($("select[name=grade]").val()=="") {
    		$("#alert-message").text("학년을 선택하세요.");
    		$(".alert").removeClass('hidden');
    		return;
    	}
    	
    	if($("select[name=year]").val()=="") {
    		$("#alert-message").text("모의고사 시행년도를 선택하세요.");
    		$(".alert").removeClass('hidden');
    		return;
    	}
    	
    	if($("select[name=month]").val()=="") {
    		$("#alert-message").text("모의고사 시행월을 선택하세요.");
    		$(".alert").removeClass('hidden');
    		return;
    	}
    	
    	var url = $("form").attr("action");

    	var fault = "";
    	$(".fault-td").each(function() {
    		console.log("fault : " , fault);
    		fault += $(this).text() + ",";
    	});
    	fault = fault.slice(0,-1);
    	
    	$("input").val(fault);
    	$('form').submit();
    }
   
});