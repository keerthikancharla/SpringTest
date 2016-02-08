package com.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by keerthiprasad on 1/12/16.
 */
@Scope("singleton")
@Component("CustomAnnotation")
public @interface StereoAnnotation {
}
