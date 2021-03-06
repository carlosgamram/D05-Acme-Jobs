
package acme.features.anonymous.companyrecord;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.components.CustomCommand;
import acme.entities.companyrecords.Companyrecord;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Anonymous;

@Controller
@RequestMapping("anonymous/companyrecord")
public class AnonymousCompanyrecordController extends AbstractController<Anonymous, Companyrecord> {

	@Autowired
	private AnonymousCompanyrecordListService		listService;

	@Autowired
	private AnonymousCompanyrecordShowService		showService;

	@Autowired
	private AnonymousCompanyrecordListBestService	listBestService;


	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.SHOW, this.showService);

		//CustomCommand
		super.addCustomCommand(CustomCommand.LIST_BEST, BasicCommand.LIST, this.listBestService);
	}

}
