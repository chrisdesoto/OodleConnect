
$(document).ready(function() {
    $('.tooltipped').tooltip({delay: 50});
    $('select').material_select();
    $('.modal-trigger').leanModal();
    $('.button-collapse').sideNav();
    fadeResults();
    Materialize.updateTextFields();
    $("#realEstate-link").css("background-color", "#eee");
    setActivePage();
    initGoToPageEnterKey();
});

function initGoToPageEnterKey(){
    $('.go-to-page-input').find('input').keypress(function(e){
        if ( e.which == 13 ) // Enter key = keycode 13
        {
            this.parentNode.getElementsByClassName('goToPageButton')[0].click();
            return false;
        }
    });
}

function setActivePage(){

    var pages = $(".pagination li a");
    for (i = 1; i &lt; pages.length; i++){
        if(pages.get(i).text == $(".currentPage")[0].innerHTML){
            pages.get(i).parentNode.style.backgroundColor = '#DC4040';
            pages.get(i).style.color = '#FFF';
        }
    }

}

function setClick(){

    var displayLink = "#" + $("#displayed").text() + "-link";

    $(".side-nav li").css("background-color", "transparent");

    $(displayLink).css("background-color", "#eee");

};

function setTrigger(data){
    if (data.status == "success"){
        $('.modal-trigger, .modal2-trigger').leanModal();
        fadeResults();
        setActivePage();
    }
};

function fadeResults(){
    if($(".results li").length > 0){
        $(".results").fadeIn();
        $(".pagination").fadeIn();
        $(".go-to-page").fadeIn();
    }
};

function showModal(data){
    if (data.status == "success"){
        var name = $('main span:first-child span:first-child').attr('id');
        var name = "#" + name.substring(8, name.length-5) + "-modal";
        console.log(name);
        $(name).openModal();
    }
};

function resetFormFields(data){
    if (data.status == "success"){
        $('select').material_select();
        $('.tooltipped').tooltip({delay: 50});
        $('.button-collapse').sideNav();
        Materialize.updateTextFields();
        setTrigger(data);
        setClick();
        initGoToPageEnterKey();
    }
};