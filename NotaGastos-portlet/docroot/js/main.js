function openTab(evt, tabName) {
	//alert("dates.lenght : "+dates.lenght);
    // Declare all variables
    var i, tabcontent, tablinks;
    // Get all elements with class="tabcontent" and hide them
    tabcontent = document.getElementsByClassName("tabcontent");
    for (i = 0; i < tabcontent.length; i++) {
        tabcontent[i].style.display = "none";
    }
    // Get all elements with class="tablinks" and remove the class "active"
    tablinks = document.getElementsByClassName("tablinks");
    for (i = 0; i < tablinks.length; i++) {
        tablinks[i].className = tablinks[i].className.replace(" active", "");
    }
    // Show the current tab, and add an "active" class to the link that opened the tab
    document.getElementById(tabName).style.display = "block";
    evt.currentTarget.className += " active";
}

function MuestraNotas() {
	$("#notasGasto").attr("style", "visibility:visible;")
}

function MostrarLogo() {
	$("#lineaLogo").attr("style", "visibility:visible; height:auto; width:100%;"); 
	$("#lineaLogoMostrar").attr("style", "visibility:hidden;position:absolute;");
	$("#lineaLogoOcultar").attr("style", "visibility:visible;cursor:pointer;position:relative;");	
}

function OcultarLogo() {
	$("#lineaLogo").attr("style", "visibility:hidden; height:0px; width:0px;"); 
	$("#lineaLogoOcultar").attr("style", "visibility:hidden;position:absolute;");
	$("#lineaLogoMostrar").attr("style", "visibility:visible;cursor:pointer;position:relative;");	
}

$("#tabDepartamentoV").on("click", function(event) {				
	openTab(event, "DepartamentoV");		
	$("#<portlet:namespace/>vista").val("V");
});

$("#tabDepartamento").on("click", function(event) {				
	openTab(event, "Departamento");		
	$("#<portlet:namespace/>vista").val("D");
});

$("#tabUsuarioHist").on("click", function(event) {				
	openTab(event, "UsuarioHist");
	$("#<portlet:namespace/>vista").val("H");
});

$("#tabUsuario").on("click", function(event) {				
	openTab(event, "Usuario");
	$("#<portlet:namespace/>vista").val("U");
});