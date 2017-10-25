<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
	<link rel="shortcut icon" href="barcode_6.png" >
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" type="text/css" href="bower_components/bootstrap/dist/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="bower_components/metisMenu/dist/metisMenu.min.css" />
	<link rel="stylesheet" type="text/css" href="bower_components/font-awesome/css/font-awesome.min.css" />
	<link href="bower_components/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.css" rel="stylesheet">
	<title>Consulta Registro</title>
</head>
<body>
	<div class="container">
		<div class="row">
            <div class="col-lg-12">
                <h2 class="page-header">Consulta dos Boletos Registrados</h2>
            </div>
        </div>
	    <div class="row">
	        <div class="col-md-4 col-md-offset-4">
	            <div class="login-panel panel panel-default">
	                <div class="panel-heading">
	                    <h3 class="panel-title">Consulta dos Boletos Registrados</h3>
	                </div>
	                <div class="panel-body">
	                    <form role="form1" name="form1" action="ControlarConsulta" method="post">
	                        <fieldset>
	                            <div class="form-group">
	                                <input class="form-control" placeholder="Nosso Numero" name="nosso_numero" value="${param['nosso_numero']}" autofocus>
	                            </div>
	                            <div class="form-group">
	                                <input class="form-control" placeholder="Numero Documento" name="numero_documento" value="${param['numero_documento']}">
	                            </div>
	                            <div class="form-group">
                                     <label>Produção</label>
                                     <select name="production" class="form-control">
                                     	<option  value="true" selected>PRODUÇÃO</option>
                                     	<option  value="false">HOMOLOG</option>
                                     </select>
                                </div>
	                            <!-- Change this to a button or input when using this as a form -->
								<input type="submit" class="btn btn-lg btn-success btn-block" name="btnConsultar" value="Consultar" />
						
	                        </fieldset>
	                    </form>
	                </div>
	            </div>
	        </div>
	        <div class="col-lg-12">
		        <div class="panel panel-default">
		        	<div class="panel-heading">
                            Boleto
                    </div>
		        	<div class="panel-body">
	                    <form role="form1" name="form1" action="ControlarConsulta" method="post">
							<div class="table-responsive">
							      <table class="table table-striped table-bordered table-hover">
							          <thead>
							              <tr>
							                   <th>Merchant</th>
							                   <th>Nosso Numero</th>
							                   <th>Numero Documento</th>
							                   <th>Data Requisição</th>
							                   <th>Data Registro</th>
							                   <th>Codigo</th>
							                   <th>Mensagem</th>
							                   <th>Detalhes</th>
							              </tr>
							          </thead>
							          <tbody>
										<c:forEach items="${listar}" var="obj">
							              <tr class="odd gradeA">
							               	<td>${obj.merchant_id}</td>
							                   <td>${obj.boleto.nosso_numero}</td>
							                   <td>${obj.boleto.numero_documento}</td>
							                   <td><fmt:formatDate value="${obj.boleto.data_requisicao}" type="both" pattern="dd/MM/yyyy HH:mm:ss.SSS" dateStyle="full"/></td>
							                   <td><fmt:formatDate value="${obj.boleto.data_registro}" type="both" pattern="dd/MM/yyyy HH:mm:ss.SSS" dateStyle="full"/></td>
							                   <td>${obj.status.codigo}</td>
							                   <td>${obj.status.mensagem}</td>
							                   <td>${obj.status.detalhes}</td>
							              </tr>
							     		</c:forEach>         
							         </tbody>
							     </table>
							</div>
	                    </form>
		             </div>
		         </div>
	         </div>
	    </div>
	</div>
	<!-- /#wrapper -->

    <script src="bower_components/jquery/dist/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="bower_components/metisMenu/dist/metisMenu.min.js"></script>

    <!-- DataTables JavaScript -->
    <script src="bower_components/datatables/media/js/jquery.dataTables.min.js"></script>
    <script src="bower_components/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.min.js"></script>

    <!-- Page-Level Demo Scripts - Tables - Use for reference -->
    <script>
    $(document).ready(function() {
        $('#dataTables-example').DataTable({
                responsive: true
        });
    });
    </script>
</body>
</html>