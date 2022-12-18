$(function(){
	let number;
	let fruits;
	let memo;
	const urlPath = location.pathname;
	let num = urlPath.split('/')[2];
	$('.update').click(function() {
		number = $('input[name="number"]').val();
		fruits = $('input[name="fruits"]').val();
		memo = $('textarea[name="memo"]').val();
        $.ajax({
            url: `/fruits/${num}/update`,
            type: "PUT",
            data: {
                number: number,
				fruits: fruits,
				memo: memo
            },
        }).done(function(data) {
			location.href = "/fruits/"
        }).fail(function(Exception ,e){
			console.log(e);
		});
	});
});