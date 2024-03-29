
package acme.features.sponsor.noncomercialbanner;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.components.CustomCommand;
import acme.entities.noncomercialbanners.NonComercialBanner;
import acme.entities.roles.Sponsor;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;

@Controller
@RequestMapping("/sponsor/non-comercial-banner/")
public class SponsorNonComercialBannerController extends AbstractController<Sponsor, NonComercialBanner> {

	@Autowired
	private SponsorNonComercialBannerShowService		showService;

	@Autowired
	private SponsorNonComercialBannerListMineService	listMineService;


	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.SHOW, this.showService);

		super.addCustomCommand(CustomCommand.LIST_MINE, BasicCommand.LIST, this.listMineService);
	}

}
