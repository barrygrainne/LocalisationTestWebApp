package ie.rccourse;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller // controller is the thing that responds to our requests
public class MainController {
	
	@RequestMapping("/{lang}/home") // have to specify location i.e. home page otherwise it goes through list index.jsp etc..
	//lang added into home
	public ModelAndView home(@PathVariable("lang")String lang){ // fn returns a model and a view, the view is home.
		 Locale locale = new Locale(lang);
		//Locale locale = Locale.FRANCE;  //hardcode to France
		LocalMessage lm = new LocalMessage(locale);
		ModelAndView mav = new ModelAndView("home", "prompt", lm.getMessage("prompt"));
		mav.addObject("lm", lm);
		
		return mav;
	}
}
