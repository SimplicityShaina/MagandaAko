package HibernateStream.com.HibernateStream;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;


public class moviemain {
	
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int insert(movie stream) {
		
		this.hibernateTemplate.save(stream);
		return 1;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public moviemain() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public moviemain(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public String toString() {
		return "streamdao [hibernateTemplate=" + hibernateTemplate + " ]";
	}

}
