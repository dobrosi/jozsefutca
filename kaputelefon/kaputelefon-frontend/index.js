$( '#topheader .navbar-nav a' ).on( 'click', function () {
alert();
	$( '#topheader .navbar-nav' ).find( 'li.active' ).removeClass( 'active' );
	$( this ).parent( 'li' ).addClass( 'active' );
});