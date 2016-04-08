var mmd = $("#cmmd").val();
		if(mmd == "Create Customer"){
			$("#act").click(function() {
				$("#FindForm").show();
			})
		}
		if(mmd == "Reserve Room"){
			$("#act").click(function() {
				$("RoomForm").show();
			})
		}
		if(mmd == "Create Payment"){
			$("#act").click(function() {
				$("#PayForm").show();
			})
		}
		if(mmd == "Get Customer By ID"){
			$("#act").click(function() {
				$("#TForm").show();
			})
		}
		if(mmd == "Get Customer By Name"){
			$("#act").click(function() {
				$("#CForm").show();
			})
		}
		if(mmd == "Get Current Customers"){
			$("#act").click(function() {
				alert("This function isn't functional");
			})
		}
		if(mmd == "Get Transactions"){
			$("#act").click(function() {
				$("#TForm").show();
			})
		}
		if(mmd == "Get Vacancies"){
			
		}
		if(mmd == "Get Reservations"){
			
		}