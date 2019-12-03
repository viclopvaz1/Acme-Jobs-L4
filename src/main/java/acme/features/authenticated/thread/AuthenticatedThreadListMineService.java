
package acme.features.authenticated.thread;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Authenticated;
import acme.framework.entities.Principal;
import acme.framework.services.AbstractListService;

@Service
public class AuthenticatedThreadListMineService implements AbstractListService<Authenticated, acme.entities.threads.Thread> {

	@Autowired
	AuthenticatedThreadRepository repository;


	@Override
	public boolean authorise(final Request<acme.entities.threads.Thread> request) {

		assert request != null;
		return true;
	}

	@Override
	public void unbind(final Request<acme.entities.threads.Thread> request, final acme.entities.threads.Thread entity, final Model model) {

		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "title");

	}

	@Override
	public Collection<acme.entities.threads.Thread> findMany(final Request<acme.entities.threads.Thread> request) {

		assert request != null;

		Collection<acme.entities.threads.Thread> result;
		Principal principal;

		principal = request.getPrincipal();
		result = this.repository.findManyByAuthenticatedId(principal.getActiveRoleId());

		return result;
	}

}
