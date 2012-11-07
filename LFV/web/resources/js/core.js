function consultaAjax(data, action, idResult){
     jQuery.ajax({
        url : action,
        data: data,
        success: function(returnValue) {
            jQuery(idResult).html(returnValue);
        }
    });
}


