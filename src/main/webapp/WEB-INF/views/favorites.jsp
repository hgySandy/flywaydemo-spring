<div class="row">
	<h3>Favorites</h3>
	<div class="col-md-6">
	    <ul class="list-group">
	    	<li class="list-group-item" ng-repeat="f in favorites">
	    		<h4>{{f.contact.name}} - {{f.contact.phoneNumber}} <a class="btn btn-default" href="#/details/{{f.contact.id}}">Details</a></h4>
	    	</li>
	    </ul>
	    <a class="btn btn-default" href="#/">Home</a>
	</div>
</div>