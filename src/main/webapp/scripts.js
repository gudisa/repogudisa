$(function(){
	
	var content = document.getElementByid('content');
	var html = '';
	data = {
			title : 'real  cool peole',
			people : [
			          {
			        	  name: 'John',
			        	  age : 34,
			        	  email : 'john@gmail.com'
			          },
			          
			          {
			        	  name: 'Sally',
			        	  age : 22,
			        	  email : 'sally@gmail.com'
			          },
			          {
			        	  name: 'George',
			        	  age : 45,
			        	  email : 'george@gmail.com'
			          },
			          ]
	     };
	var  temple = Handlebars.compile(document.getElementById('people-template').innerHTML);
};