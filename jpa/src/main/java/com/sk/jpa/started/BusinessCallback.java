package com.sk;

import javax.persistence.EntityManager;

public interface BusinessCallback {

	void progress(EntityManager em);

}
