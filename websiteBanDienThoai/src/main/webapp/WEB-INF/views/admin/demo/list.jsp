<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<h4 class="card-title">Hiển thị chuyên mục</h4>
<div class="material-datatables">
	<table id="datatables"
		class="table table-striped table-no-bordered table-hover"
		cellspacing="0" width="100%" style="width: 100%">
		<thead>
			<tr>
				<th>ID</th>
				<th>TÊN CHUYÊN MỤC</th>
				<th>STATUS</th>
				<th class="disabled-sorting text-right">HÀNH ĐỘNG</th>
			</tr>
		</thead>

		<tbody>

				<tr>
					<td>$id}</td>
					<td>$name}</td>
					<td>$status}</td>
					<td class="td-actions text-right">
						<a href="" class="btn btn-sm btn-warning" title="Detail">
			    			<i class="fa fa-pencil"></i>
			    		</a>
					</td>
				</tr>

		</tbody>
	</table>
</div>