$(document).ready(function() {
	$('.full-width-table td').click(function() {
		if ($(this).text() == "") {
			return;
		}
		$(this).toggleClass("fault-td");
	});

	$("select").change(function() {
		console.log("hidden");
		$(".alert").addClass('hidden');
	})

	$("button").click(inputAnswerData);

	generateAnswerTable();

});

function inputAnswerData() {
	var url = $("form").attr("action");
	$('form').submit();
}

function generateAnswerTable() {
	var table = $("<table />", {
		class : "table"
	});

	var thead = $("<thead />");
	var trHead = $("<tr />");
	trHead.append($("<td />", {
		text : "문제번호"
	}));
	trHead.append($("<td />", {
		text : "정답"
	}));
	trHead.append($("<td />", {
		text : "배점"
	}));
	trHead.append($("<td />", {
		text : "세부영역"
	}));
	trHead.append($("<td />", {
		text : "출제의도"
	}));
	trHead.append($("<td />", {
		text : "해설"
	}));

	thead.append(trHead);
	table.append(thead);

	var tbody = $("<tbody />");

	for (i = 1; i <= 45; i++) {
		var trBody = $("<tr />");
		// 문제번호
		var tdNumber = $("<td />", {
			text : i
		});
		var tdInput = $("<input />", {
			name : "number",
			value : i,
			type : "hidden"
		});
		tdNumber.append(tdInput);
		trBody.append(tdNumber);

		// 정답 dropdown
		var tdAnswer = $("<td />");
		var selectAnswer = $("<select>", {
			name : "answer",
			class : "form-control"
		});
		var optionAnswerLabel = $("<option />", {
			label : "정답"
		});
		selectAnswer.append(optionAnswerLabel);
		for (j = 1; j <= 5; j++) {
			var option = $("<option />", {
				value : j,
				text : j
			});
			selectAnswer.append(option);
		}
		tdAnswer.append(selectAnswer);
		trBody.append(tdAnswer);
		
		// 배점 dropdown
		var tdScore = $("<td />");
		var selectScore = $("<select>", {
			name : "score",
			class : "form-control"
		});
		var optionScoreLabel = $("<option />", {
			label : "배점"
		});
		selectScore.append(optionScoreLabel);

		selectScore.append($("<option />", {
			value : "2",
			text : "2"
		}));
		selectScore.append($("<option />", {
			value : "3",
			text : "3"
		}));
		tdScore.append(selectScore);
		trBody.append(tdScore);		

		// 세부영역 dropdown
		var tdDomain = $("<td />");
		var selectDomain = $("<select>", {
			name : "domain",
			class : "form-control"
		});
		var optionDomainLabel = $("<option />", {
			label : "세부영역"
		});
		selectDomain.append(optionDomainLabel);

		selectDomain.append($("<option />", {
			value : "1",
			text : "화법"
		}));
		selectDomain.append($("<option />", {
			value : "2",
			text : "작문"
		}));
		selectDomain.append($("<option />", {
			value : "3",
			text : "문법"
		}));
		selectDomain.append($("<option />", {
			value : "4",
			text : "독서"
		}));
		selectDomain.append($("<option />", {
			value : "5",
			text : "문학"
		}));
		tdDomain.append(selectDomain);
		trBody.append(tdDomain);

		// 출제의도
		var tdPurpose = $("<td />");
		var purposeInput = $("<input />", {
			type : "text",
			class : "form-control",
			name : "purpose"
		});
		tdPurpose.append(purposeInput);
		trBody.append(tdPurpose);

		// 해설
		var tdExplain = $("<td />");
		var explainInput = $("<input />", {
			type : "text",
			class : "form-control",
			name : "explain"
		});
		tdExplain.append(explainInput);
		trBody.append(tdExplain);
		tbody.append(trBody);
	}
	table.append(tbody);
	$("#answer-table").append(table);
}
