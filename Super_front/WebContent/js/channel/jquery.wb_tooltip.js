;(function($){
	$.fn.wb_tooltip = function(options){
		var opts = $.extend({}, $.fn.wb_tooltip.defaults, options);
		
		$root	= $(this);
		
		$root.each(function(index) {
			$twig = $(this);
			
			string		= $twig.attr("title");				//��ȡtitle����
			$twig.attr("title","");							//���ԭ��titleֵ������Ĭ��title��ʽ����
			
			offset 		= $twig.offset();					//��ȡ��ʾͼ��λ��
			width		= $twig.outerWidth();				//��ȡ��ʾͼ����
			_left		= offset.left + width + 7;			//����tips����λ��
			_top		= offset.top - 8;
			domNum		= document.getElementsByTagName('*').length;		//��ȡdom������������tips����z-indexֵ�����ⱻ�ڵ�
			
			$('body').append('<div class="tipsCon" style="position: absolute; display: none; top:'+ _top +'px; left:'+ _left +'px; z-index: ' + domNum + ';"></div>');
			$('.tipsCon').eq(index).html(string);								//����tip����
			$('.tipsCon').append('<span class="tipsCorner"></span>');			//tip�������Ǽ�ͷ
			
			$twig.hover(function() {
				$('.tipsCon').eq(index).show();
			}, function() {
				$('.tipsCon').eq(index).hide();
			});
			
			$('.tipsCon').eq(index).hover(function() {
				$(this).show();
			}, function() {
				$(this).hide();
			});
		});
		
	}
	$.fn.wb_tooltip.defaults = {
		
	};
})(jQuery);
