$(document).ready(function(){
	
	// hides and shows the information above the 'View Details' buttons in 'about.html' page
	$(".btn-collapse").click(function(event){
		
		var $collapseThis = $(this).closest(".collapse-group").find(".collapse");
		$collapseThis.fadeToggle(50);
		//$collapseThis.collapse("toggle"); // alternative option
		
		event.preventDefault();
	});
});