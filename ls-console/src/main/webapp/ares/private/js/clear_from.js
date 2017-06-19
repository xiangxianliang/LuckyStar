$.fn.clearForm = function() {
	return this.each(function() {
		var type = this.type;
		var reset = $(this).attr("reset");
		tag = this.tagName.toLowerCase();
		var disabled = this.disabled;

		// alert(type+':'+type+"=="+disabled);

		if (tag == 'form') {
			return $(':input', this).clearForm();
		}
		if (disabled == false && (typeof (reset) == "undefined") || reset == "true") {
			if (type == 'text' || type == 'password' || tag == 'textarea') {
				this.value = '';
			} else if (type == 'hidden') {
				return;
			} else if (type == 'checkbox' || type == 'radio') {
				this.checked = false;
			} else if (tag == 'select') {
				this.selectedIndex = 0;
			}
		} else {
			return;
		}
	});
};

function clearFrom2() {
	$(':input', '#form111').not(':button, :submit, :reset, :hidden, :disabled').val('').removeAttr('checked').removeAttr('selected');
}