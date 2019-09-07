(function($){

	$.STUDENTPLANLIST = function(){

		//表格控件的加载
		this.TableInit = function () {

			$("#compete_list").bootstrapTable('destroy');
			$('#compete_list').bootstrapTable({
				url: "/shop/first/1", 
				contentType:"application/x-www-form-urlencoded; charset=UTF-8",
				dataType:"json",
				method: 'post', 
				// toolbar: false, 
				striped: true,  
				// cache: true,  
//				pagination: true, 
				// sortable: true, 
				// sortOrder: "asc",  
//				queryParams: Myobj.queryParams,
				sidePagination: "server",
//				pageNumber: 1,  
//				pageSize: 8, 
//				pageList: [8,15,30,50], 
//				paginationPreText: "上一页",
//				paginationNextText: "下一页",
				onLoadSuccess : function(data){
					if(data.rows[0] != undefined){

					}
				},
				columns: [{
					field: 'id',
					title: '序号',
					align:'center', valign: 'middle', width: '150',
					formatter: function(value, row, index) {
						return index + 1;
					}
				}], 
				columns: [{
					field: 'id',
					title: '序号',
					align:'center', valign: 'middle', width: '150',
					formatter: function(value, row, index) {
						return index + 1;
					}
				}], 
				columns: [{
					field: 'classname',
					title: '序号',
					align:'center', valign: 'middle', width: '150',
					formatter: function(value, row, index) {
						return index + 1;
					}
				}], 
				columns: [{
					field: 'schoolname',
					title: '序号',
					align:'center', valign: 'middle', width: '150',
					formatter: function(value, row, index) {
						return index + 1;
					}
				}
				]
			});
		};

	};
})(jQuery);
var STUDENTPLAN = new jQuery.STUDENTPLANLIST();
$(function(){

	STUDENTPLAN.TableInit();
	
})
