/*global $:false */


function checkElementValidity() {
  'use strict';
  var $element = $(this);
  var element = $element.get(0);
  var feedbackIcon = $element.parent().find('.form-control-feedback');
  var helpBlock = $element.parent().find('.help-block');
  var formGroup = $element.parent().parent();
  var collapseElement = $element.closest('.panel-collapse.collapse');

  if (element.checkValidity()) {
    feedbackIcon.removeClass('glyphicon-remove').addClass('hidden');
    if (element.value) {
      //only show ok when field is populated for non-required fields
      feedbackIcon.addClass('glyphicon-ok').removeClass('hidden');
    }
    formGroup.addClass('has-feedback').removeClass('has-error');
    helpBlock.addClass('hidden');
  } else {
    feedbackIcon.addClass('glyphicon-remove').removeClass('hidden').removeClass('glyphicon-ok');
    formGroup.addClass('has-feedback').addClass('has-error');
    collapseElement.data('section-valid', false);
    helpBlock.removeClass('hidden').text(element.validationMessage);
  }

}

$(document).ready(function () {
  'use strict';
  $('input,textarea').each(checkElementValidity);
  $('input,textarea').bind('change', checkElementValidity);
});

