/*
 * SUMMARY:
 * 1)  INIT
 * 2)  FUNCTIONS
 * 3)  UTILITY
 */

jQuery(function($){
	
 	/* **************************************** */
	/* INIT */
	/* **************************************** */
	scroll_top();
	scroll_fixed_header();
	scroll_fixed_tab();
	main_menu();
	minimize_header();
    minimize_header_onscroll();
	main_visual();
	visual_button_scroll_down();
	main_products();
	banner_cycle();
	banner_click();
	summary_cycle();
	minimize_tab();
    minimize_tab_onscroll();
    tab_click_event();
    scrollto_nav();
	news_full_click();
	if_firefox();
	menu_debug_mobile();
	board_date();
	/* **************************************** */
	/* FUNCTIONS */
	/* **************************************** */
	  
	// scroll fixed header
	function scroll_fixed_header(){	
		$(window).scroll(function(event) {
			if($(document).scrollLeft() > 0){
				$("#header").css("width", $(document).width()+'px');
				$("#header").css("left", (-$(document).scrollLeft())+'px');
			}else{
				$("#header").css("width", '100%');
				$("#header").css("left", '0px');
			}
		});
	}
	
	
	// scroll fixed tab
	function scroll_fixed_tab(){	
		$(window).scroll(function(event) {
			if($(document).scrollLeft() > 0){
				$(".tab_menu.minimize").css("width", $(document).width()+'px');
				$(".tab_menu.minimize").css("left", (-$(document).scrollLeft())+'px');
			}else{
				$(".tab_menu.minimize").css("width", '100%');
				$(".tab_menu.minimize").css("left", '0px');
			}			
		});
	}
	    
	    
	// 탑 버튼
	function scroll_top(){
		$(window).on('scroll',function(){
				
			var windowTop = $(window).scrollTop();
	
			if(windowTop > $(window).height()){
				$(".page_top_button_area").addClass("show");
			}else{
				$(".page_top_button_area").removeClass("show");
			}
	
			if(windowTop > $(document).height() - $(window).height() - $("#footer").height()){
				$(".page_top_button_area").addClass("stop");
			}else{
				$(".page_top_button_area").removeClass("stop");
			}
			
		});
			
		$(".page_top_button").click(function(){
			
			$("html, body").animate({
				scrollTop : 0
			}, 1000, "easeInOutQuart");
			
		});	
	}
	
	
	// 메인메뉴 이벤트
	function main_menu(){
		
		// hover
	    $('.dropdown, .dropdown_sub, .bg_container').hover(function(){
	    	$('.dropdown_sub, header .bg_container').css('display','block');
		},function() {
		    $('.dropdown_sub, header .bg_container').css('display','none');
		});
		
		$('.dropdown_sub').hover(function(){
	        $(this).parent().toggleClass('hover');
	    }, function(){
	        $(this).parent().removeClass('hover');
	    });	
	    
    }
    
    
    // 모바일 1depth 메뉴 이벤트 비활성화
	function menu_debug_mobile(){
	
		if(is_mobile()){
			$('.dropdown > li > a').click(function() {
				return false;
			});
		}
	
	}
    
    
    // FIX HEADER ANIMATION 
	function minimize_header(){
		
		var $header = $('#header');
		var $window = $(window);
		var header_height = $header.height();
		
		if($window.scrollTop() > header_height ){
			$header.addClass('minimize');
		}else{
			$header.removeClass('minimize');
		}
		
	}
	
	function minimize_header_onscroll(){
		
		$(window).on('scroll',function(){
			minimize_header();		
		});
		
	}
    
    
    // FIX TAB ANIMATION
	function minimize_tab(){
		
		if($('.tab_menu').length > 0){	
		    var $tab 		= $('.tab_menu');
			var $top        = $('.top_content');
			var $window 	= $(window);
			var tab_height  = parseInt($tab.offset().top - 80);
		    
			if($window.scrollTop() > tab_height ){
				$tab.addClass('minimize');
				$top.addClass('minimize');
			}
			if($window.scrollTop() < $('.top_content').outerHeight()+40){
				$tab.removeClass('minimize');
				$top.removeClass('minimize');
				
				$tab.removeAttr("style");
			}
		}
				
	}
	
	function minimize_tab_onscroll(){
		
		$(window).on('scroll',function(){
			minimize_tab();		
		});
		
	}
	
	
	// 텝 매뉴 클릭이벤트
	function tab_click_event(){
		$('.tab_menu').on('click', "li" ,function(){
	
			var fixed_header = 0;
			var target	     = $(this).attr('class');
			
			if($('#'+target).length > 0){
			
				if(target=='effect') {
					fixed_header = 258;
				} else if (target=='ceo') {
					fixed_header = 80;
				} else {
					fixed_header = 140;
				}
				
				var position = $('#'+target).offset().top - fixed_header; 
				
				$('html,body').animate({
					scrollTop : position
				},800);
			}
				
			return false;
				        
	    });
    }
    
    
	// 메인롤링이미지
	function main_visual(){
		$('.visual_more, .arrow').hover(function(){ 
		    $('#visual').cycle('pause'); 
		},function(){ 
		    $('#visual').cycle('resume'); 
		}); // 버튼 hover시 롤링 멈춤
		
		// $('#visual').on( 'cycle-initialized', function( event, opts ) {
			// if(is_support_video()){
			   // $('video').get(0).play();
			// }
		// });
		
		$('#visual').cycle({
			timeout         : 4000,
			speed           : 500,
			slides          : 'li',
			log				: false,
			prev            : '.visual_slider .pre_btn',
			next            : '.visual_slider .next_btn'
		});
	}
	
	
	// 메인 비쥬얼 스크롤 버튼 위치
	function visual_button_position(){
	
		var visual_height = $('#visual').height();
		var header_height = $('#header').height();

		if($(window).height() < (visual_height+header_height)) {
			$('.visual_arrow a').css('top', $(window).height() - 100);
		} else {
			$('.visual_arrow a').removeAttr( 'style' );
		}
		
	}
	
	function visual_button_resize(){
		
		$(window).resize(function() { 
			visual_button_position();		
		});
		
	}
	
	
    // 메인 비쥬얼 스크롤
    function visual_button_scroll_down(){
	    $('.visual_arrow a').on('click',function(){
	    	var target_top = $('.main_products').offset().top;
	    	
	    	$('html,body').animate({
	    		scrollTop : target_top - 80
	    	},500);
	    	
	    	return false;
	    });
    }
        
        
	// 제품 마우스오버이벤트
	function main_products(){
	    $('.products_img, .product_more').hover(function(){
	        $(this).parent().toggleClass('hover');
	    }, function(){
	        $(this).parent().removeClass('hover');
	    });
    }
    
    
    // 배너 사이클
    function banner_cycle(){
	    $('#certification').cycle({
			fx              : 'carousel',
			carouselVisible : 5.5,
			carouselFluid   : true,
			timeout         : 2000,
			speed           : 500,
	        centerVert      : true,
	        log				: false,
			easing          : 'easeInExpo',
			slides          : 'div',
			prev            : '#certification_pre',
			next            : '#certification_next'	
		});
		
		$('#customer').cycle({
			fx              : 'carousel',
			carouselVisible : 3.7,
			carouselFluid   : true,
			timeout         : 2000,
			speed           : 500,
	        centerVert      : true,
	        log				: false,
			easing          : 'easeInExpo',
			slides          : 'div',
			prev            : '#customer_pre',
			next            : '#customer_next'	
		});
	}
	
	
	// 배너 클릭
	function banner_click(){
		$('#certification').on('click', function(){
			window.location.href = '../technology/certification.php';
		});
		
		$('#customer').on('click', function(){
			window.location.href = '../technology/result.php';
		});
	}
	function summary_cycle(){
	    $('#summary_image').cycle({
			fx              : 'tileBlind',
			timeout         : 2000,
			speed           : 1500,
			tileCount		: 1,
	        pager           : '.summary_image_pager',
	        easing			: 'easeInOutExpo'
		});
	}
	// SCROLL NAVIGATION
	function scrollto_nav(){

		$(window).load(function(){
			
			// get and store section position
			var sections_pos = [];
			var el_offset =0;
			
			$('.tab_menu ul li').each(function(){
				
				var section = $(this).attr('class');
				var section_top = $('#'+ section).offset().top;
					
				section_top = section_top + el_offset;
						
				sections_pos.push([section,section_top]);
		
			});
			sections_pos.push(['#footer',$('#footer').offset().top]);
			//console.log(sections_pos);

		    scrollto_nav_current(sections_pos);
		
			// Listen scroll and add current class if necessary
			$(window).on('scroll',function(){			
				//console.log($(window).scrollTop());
				scrollto_nav_current(sections_pos);				
			}); 
		
		});
		
	}
	
	function scrollto_nav_current(sections_pos){
		
		var current_pos = $(window).scrollTop()+200;
	
		$.each(sections_pos, function(i, section){
			
			 var id = section[0];
			 var pos = section[1];
			 // console.log('pos : '+pos);
			 
			 var next_pos = 0; 
			 var offset = 140;
	         
			 if(i < sections_pos.length - 1){		
				 next_pos = sections_pos[i+1][1];
			 }
 
			 if(current_pos >= pos-offset && current_pos < next_pos-offset){
				 $('.tab_menu ul li').removeClass('active');
				 $('.tab_menu ul li.'+id).addClass('active');
			 }
			 		 
		});
	
	}
	
	
	
	//소식 full click, hover효과
	function news_full_click(){
		// 리스트
		$('.netman_board table tbody tr').on('click',function(){
		     var link = $(this).find('a').attr('href');
		     if(link	!=	undefined)
		     	window.location.href = link;
		})
	    
		// 상세보기
		$('.document_control').on('click',function(){
		     var link = $(this).find('a').attr('href');
		     if(link	!=	undefined)
		     	window.location.href = link;
		})
		
		$('.document_control').hover(function(){
	        $(this).toggleClass('hover');
	    });	
	}
	
	
	// 파이어폭스 확인
	function if_firefox() {
		var is_firefox = navigator.userAgent.toLowerCase().indexOf('firefox') > -1;
		
		if(is_firefox) {
			$('html').addClass('firefox');
		}
	}
	
	
	function board_date() {
		$(function() {
	    	$( "#datepicker" ).datepicker({
	    		dateFormat: "yy-mm-dd"
	    	});
	  	});
	}	
	

	/* **************************************** */
	/* UTILITY */
	/* **************************************** */
	
	// DETECT IF VIDEO IS SUPPORT
	// source : Modernizr/feature-detects/video.js (custom)
	function is_support_video(){

		var elem = document.createElement('video');
		var bool = false;

		try {
		  if (bool = !!elem.canPlayType) {
			bool = new Boolean(bool);
		  }
		} catch (e) {}
	
		return bool;
  
	}
	
	
	// SIMPLE MOBILE CHECK  
	function is_mobile(){
		
	   return (/Android|iPhone|iPad|iPod|BlackBerry|Windows Phone/i).test(navigator.userAgent || navigator.vendor || window.opera);
	 
	}


}) // jQuery
