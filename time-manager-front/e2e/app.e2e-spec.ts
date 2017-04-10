import { TimeManagerFrontPage } from './app.po';

describe('time-manager-front App', () => {
  let page: TimeManagerFrontPage;

  beforeEach(() => {
    page = new TimeManagerFrontPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
