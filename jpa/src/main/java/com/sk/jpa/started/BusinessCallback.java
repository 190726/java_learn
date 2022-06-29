package com.sk.jpa.started;

import javax.persistence.EntityManager;

public interface BusinessCallback {

	void progress(EntityManager em);

}
