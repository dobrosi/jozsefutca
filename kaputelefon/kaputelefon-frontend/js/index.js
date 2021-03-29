url = 'http://localhost:8080';

$( document ).ready(function () {
    $('#urlText').on('change', function() {
        url = $( this ).val();
    });
});

function menu(l) {
    page = l.getAttribute('href');
    $('.page').each(function() {
        e = $( this );
        if(page != '#' + e.attr('id')) {
            e.addClass( 'hidden' );
        } else {
            e.removeClass( 'hidden' );
        }
    });
}

function restart() {
    $.ajax({
        url: url + '/api/restart',
        type: 'GET',
        success: function(result) {
            alert(result);
        },
        error: function(result) {
            alert('error');
        }
    });
}

function factoryReset() {
    $.ajax({
        url: url + '/api/factory_reset',
        type: 'GET',
        success: function(result) {
            alert(result);
        },
        error: function(result) {
            alert('error');
        }
    });
}
