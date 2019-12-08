package twilio;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import twilio.resources.TwilioResource;


public class twilioApplication extends Application<twilioConfiguration> {

    public static void main(final String[] args) throws Exception {
        new twilioApplication().run(args);
    }

    @Override
    public String getName() {
        return "twilio";
    }

    @Override
    public void initialize(final Bootstrap<twilioConfiguration> bootstrap) {
    }

    @Override
    public void run(final twilioConfiguration configuration,
                    final Environment environment) {

        environment.jersey().register(new TwilioResource());


    }

}
