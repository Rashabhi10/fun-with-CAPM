sap.ui.define(
		["sap/ui/core/mvc/Controller",
		 "jquery.sap.global",
		 "demo/util/service",
		 "sap/m/MessageBox"],
		function(Controller, jQuery, service, MessageBox){
	return Controller.extend("demo.controller.Main",{
		onInit: function(){
			var oModel = new sap.ui.model.json.JSONModel();
			oModel.setData({
				"postPayload": {
				    "firstName": "",
				    "lastName": "",
				    "emailId": "",			
				    "companyName":"",
				    "yearExp":""
				},
				"employee": {}
			});
			//Set the model object to the Entire App level
			sap.ui.getCore().setModel(oModel);
		},
		onSelect:function(oEvent){
		////var oTable = this.getView().byId("idTable");
		////var oPath = oEvent.getParameter("rowContext").getPath();
		//var oRowIndex = oEvent.getParameter("rowIndex");
		//var oForm = this.getView().byId("idSimple");
		///var oRow = "/employee/" + oRowIndex;
		//var oModel = sap.ui.getCore().getModel();
		////oModel.setProperty("/employee",data._embedded.employee);
		//oModel.setProperty(oRow,data);
		//oForm.bindElement(oRow);
		//var oSelectedItem = oEvent.getSource();
		//var oContext = oSelectedItem.getBindingInfo("rows"); //oSelectedItem.getBindingContext("/employee");
		//var sPath = oContext.binding.getPath() + '/' + oContext.binding.iLastStartIndex;
		//var oForm = this.byId("idSimple");
		//oForm.bindElement({ path: sPath, model: "/postPayload" });		
		},
		onSave: function(){
			var oModel = sap.ui.getCore().getModel();
			var payload = oModel.getProperty("/postPayload");
			service.callService("/postEmployee","POST", payload).then(function(){
				MessageBox.confirm("Saved Success");
			}).catch(function(){
				MessageBox.error("post failed");
			});
			this.onLoadData();
		},
		onChange: function(){
			var oModel = sap.ui.getCore().getModel();
			var payload = oModel.getProperty("/postPayload");
			service.callService("/changeemployee","PUT", payload).then(function(){
				MessageBox.confirm("Changed Successfully");
			}).catch(function(){
				MessageBox.error("Change failed");
			});
			this.onLoadData();
		},
		onDelete:function(){
			var oModel = sap.ui.getCore().getModel();
			var payload = oModel.getProperty("/postPayload");
			service.callService("/deleteEmployee/"+ payload.id +	"","DELETE", payload).then(function(){
				MessageBox.confirm("Deleted Successfully");
			}).catch(function(){
				MessageBox.error("Deletion failed");
			});
			this.onLoadData();
		},
		onLoadData: function(){
			var that = this;
			service.callService("/employee", "GET", {}).then(function(data){
				//console.log(data);
				//Get the object of the table
				var oTable = that.getView().byId("idTable");
				//Create a new ui5 model which contains data
				var oModel = sap.ui.getCore().getModel();
				//oModel.setProperty("/employee",data._embedded.employee);
				oModel.setProperty("/employee",data);
				//Set the model object to the Entire App level
				//Bind aggregation of the table
				oTable.bindRows("/employee");
			}).catch(function(oError){
				MessageBox.error("Load Data Failed!!");
			});
		}
	});
});