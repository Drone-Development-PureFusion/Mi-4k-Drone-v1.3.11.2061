.class public Landroid/support/v7/app/MediaRouteChooserDialog;
.super Landroid/app/Dialog;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/app/MediaRouteChooserDialog$RouteComparator;,
        Landroid/support/v7/app/MediaRouteChooserDialog$MediaRouterCallback;,
        Landroid/support/v7/app/MediaRouteChooserDialog$RouteAdapter;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "MediaRouteChooserDialog"


# instance fields
.field private mAdapter:Landroid/support/v7/app/MediaRouteChooserDialog$RouteAdapter;

.field private mAttachedToWindow:Z

.field private final mCallback:Landroid/support/v7/app/MediaRouteChooserDialog$MediaRouterCallback;

.field private mListView:Landroid/widget/ListView;

.field private mOnItemClickTask:Landroid/os/AsyncTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/AsyncTask",
            "<",
            "Ljava/lang/Void;",
            "Ljava/lang/Void;",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private mRefreshRoutesTask:Landroid/os/AsyncTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/AsyncTask",
            "<",
            "Ljava/lang/Void;",
            "Ljava/lang/Void;",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private final mRouter:Landroid/support/v7/media/MediaRouter;

.field private mRoutes:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v7/media/MediaRouter$RouteInfo;",
            ">;"
        }
    .end annotation
.end field

.field private mSelector:Landroid/support/v7/media/MediaRouteSelector;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroid/support/v7/app/MediaRouteChooserDialog;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 2

    invoke-static {p1, p2}, Landroid/support/v7/app/MediaRouterThemeHelper;->createThemedContext(Landroid/content/Context;I)Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    sget-object v0, Landroid/support/v7/media/MediaRouteSelector;->EMPTY:Landroid/support/v7/media/MediaRouteSelector;

    iput-object v0, p0, Landroid/support/v7/app/MediaRouteChooserDialog;->mSelector:Landroid/support/v7/media/MediaRouteSelector;

    invoke-virtual {p0}, Landroid/support/v7/app/MediaRouteChooserDialog;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v7/media/MediaRouter;->getInstance(Landroid/content/Context;)Landroid/support/v7/media/MediaRouter;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/app/MediaRouteChooserDialog;->mRouter:Landroid/support/v7/media/MediaRouter;

    new-instance v0, Landroid/support/v7/app/MediaRouteChooserDialog$MediaRouterCallback;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroid/support/v7/app/MediaRouteChooserDialog$MediaRouterCallback;-><init>(Landroid/support/v7/app/MediaRouteChooserDialog;Landroid/support/v7/app/MediaRouteChooserDialog$1;)V

    iput-object v0, p0, Landroid/support/v7/app/MediaRouteChooserDialog;->mCallback:Landroid/support/v7/app/MediaRouteChooserDialog$MediaRouterCallback;

    return-void
.end method

.method static synthetic access$100(Landroid/support/v7/app/MediaRouteChooserDialog;)Landroid/support/v7/media/MediaRouter;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteChooserDialog;->mRouter:Landroid/support/v7/media/MediaRouter;

    return-object v0
.end method

.method static synthetic access$300(Landroid/support/v7/app/MediaRouteChooserDialog;)Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteChooserDialog;->mRoutes:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic access$500(Landroid/support/v7/app/MediaRouteChooserDialog;)Landroid/support/v7/app/MediaRouteChooserDialog$RouteAdapter;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteChooserDialog;->mAdapter:Landroid/support/v7/app/MediaRouteChooserDialog$RouteAdapter;

    return-object v0
.end method

.method static synthetic access$602(Landroid/support/v7/app/MediaRouteChooserDialog;Landroid/os/AsyncTask;)Landroid/os/AsyncTask;
    .locals 0

    iput-object p1, p0, Landroid/support/v7/app/MediaRouteChooserDialog;->mRefreshRoutesTask:Landroid/os/AsyncTask;

    return-object p1
.end method

.method static synthetic access$700(Landroid/support/v7/app/MediaRouteChooserDialog;)Landroid/os/AsyncTask;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteChooserDialog;->mOnItemClickTask:Landroid/os/AsyncTask;

    return-object v0
.end method

.method static synthetic access$702(Landroid/support/v7/app/MediaRouteChooserDialog;Landroid/os/AsyncTask;)Landroid/os/AsyncTask;
    .locals 0

    iput-object p1, p0, Landroid/support/v7/app/MediaRouteChooserDialog;->mOnItemClickTask:Landroid/os/AsyncTask;

    return-object p1
.end method


# virtual methods
.method public getRouteSelector()Landroid/support/v7/media/MediaRouteSelector;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteChooserDialog;->mSelector:Landroid/support/v7/media/MediaRouteSelector;

    return-object v0
.end method

.method public onAttachedToWindow()V
    .locals 4

    const/4 v3, 0x1

    invoke-super {p0}, Landroid/app/Dialog;->onAttachedToWindow()V

    iput-boolean v3, p0, Landroid/support/v7/app/MediaRouteChooserDialog;->mAttachedToWindow:Z

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteChooserDialog;->mRouter:Landroid/support/v7/media/MediaRouter;

    iget-object v1, p0, Landroid/support/v7/app/MediaRouteChooserDialog;->mSelector:Landroid/support/v7/media/MediaRouteSelector;

    iget-object v2, p0, Landroid/support/v7/app/MediaRouteChooserDialog;->mCallback:Landroid/support/v7/app/MediaRouteChooserDialog$MediaRouterCallback;

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v7/media/MediaRouter;->addCallback(Landroid/support/v7/media/MediaRouteSelector;Landroid/support/v7/media/MediaRouter$Callback;I)V

    invoke-virtual {p0}, Landroid/support/v7/app/MediaRouteChooserDialog;->refreshRoutes()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    sget v0, Landroid/support/v7/mediarouter/R$layout;->mr_chooser_dialog:I

    invoke-virtual {p0, v0}, Landroid/support/v7/app/MediaRouteChooserDialog;->setContentView(I)V

    sget v0, Landroid/support/v7/mediarouter/R$string;->mr_chooser_title:I

    invoke-virtual {p0, v0}, Landroid/support/v7/app/MediaRouteChooserDialog;->setTitle(I)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/app/MediaRouteChooserDialog;->mRoutes:Ljava/util/ArrayList;

    new-instance v0, Landroid/support/v7/app/MediaRouteChooserDialog$RouteAdapter;

    invoke-virtual {p0}, Landroid/support/v7/app/MediaRouteChooserDialog;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Landroid/support/v7/app/MediaRouteChooserDialog;->mRoutes:Ljava/util/ArrayList;

    invoke-direct {v0, p0, v1, v2}, Landroid/support/v7/app/MediaRouteChooserDialog$RouteAdapter;-><init>(Landroid/support/v7/app/MediaRouteChooserDialog;Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Landroid/support/v7/app/MediaRouteChooserDialog;->mAdapter:Landroid/support/v7/app/MediaRouteChooserDialog$RouteAdapter;

    sget v0, Landroid/support/v7/mediarouter/R$id;->mr_chooser_list:I

    invoke-virtual {p0, v0}, Landroid/support/v7/app/MediaRouteChooserDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Landroid/support/v7/app/MediaRouteChooserDialog;->mListView:Landroid/widget/ListView;

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteChooserDialog;->mListView:Landroid/widget/ListView;

    iget-object v1, p0, Landroid/support/v7/app/MediaRouteChooserDialog;->mAdapter:Landroid/support/v7/app/MediaRouteChooserDialog$RouteAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteChooserDialog;->mListView:Landroid/widget/ListView;

    iget-object v1, p0, Landroid/support/v7/app/MediaRouteChooserDialog;->mAdapter:Landroid/support/v7/app/MediaRouteChooserDialog$RouteAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteChooserDialog;->mListView:Landroid/widget/ListView;

    const v1, 0x1020004

    invoke-virtual {p0, v1}, Landroid/support/v7/app/MediaRouteChooserDialog;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setEmptyView(Landroid/view/View;)V

    invoke-virtual {p0}, Landroid/support/v7/app/MediaRouteChooserDialog;->updateLayout()V

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v7/app/MediaRouteChooserDialog;->mAttachedToWindow:Z

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteChooserDialog;->mRouter:Landroid/support/v7/media/MediaRouter;

    iget-object v1, p0, Landroid/support/v7/app/MediaRouteChooserDialog;->mCallback:Landroid/support/v7/app/MediaRouteChooserDialog$MediaRouterCallback;

    invoke-virtual {v0, v1}, Landroid/support/v7/media/MediaRouter;->removeCallback(Landroid/support/v7/media/MediaRouter$Callback;)V

    invoke-super {p0}, Landroid/app/Dialog;->onDetachedFromWindow()V

    return-void
.end method

.method public onFilterRoute(Landroid/support/v7/media/MediaRouter$RouteInfo;)Z
    .locals 1
    .param p1    # Landroid/support/v7/media/MediaRouter$RouteInfo;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Landroid/support/v7/media/MediaRouter$RouteInfo;->isDefaultOrBluetooth()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/support/v7/media/MediaRouter$RouteInfo;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteChooserDialog;->mSelector:Landroid/support/v7/media/MediaRouteSelector;

    invoke-virtual {p1, v0}, Landroid/support/v7/media/MediaRouter$RouteInfo;->matchesSelector(Landroid/support/v7/media/MediaRouteSelector;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onFilterRoutes(Ljava/util/List;)V
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Landroid/support/v7/media/MediaRouter$RouteInfo;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    add-int/lit8 v1, v0, -0x1

    if-lez v0, :cond_0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/media/MediaRouter$RouteInfo;

    invoke-virtual {p0, v0}, Landroid/support/v7/app/MediaRouteChooserDialog;->onFilterRoute(Landroid/support/v7/media/MediaRouter$RouteInfo;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move v0, v1

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    move v0, v1

    goto :goto_0
.end method

.method public refreshRoutes()V
    .locals 2

    iget-boolean v0, p0, Landroid/support/v7/app/MediaRouteChooserDialog;->mAttachedToWindow:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteChooserDialog;->mRefreshRoutesTask:Landroid/os/AsyncTask;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteChooserDialog;->mRefreshRoutesTask:Landroid/os/AsyncTask;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->cancel(Z)Z

    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/app/MediaRouteChooserDialog;->mRefreshRoutesTask:Landroid/os/AsyncTask;

    :cond_0
    new-instance v0, Landroid/support/v7/app/MediaRouteChooserDialog$1;

    invoke-direct {v0, p0}, Landroid/support/v7/app/MediaRouteChooserDialog$1;-><init>(Landroid/support/v7/app/MediaRouteChooserDialog;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Landroid/support/v7/app/MediaRouteChooserDialog$1;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/app/MediaRouteChooserDialog;->mRefreshRoutesTask:Landroid/os/AsyncTask;

    :cond_1
    return-void
.end method

.method public setRouteSelector(Landroid/support/v7/media/MediaRouteSelector;)V
    .locals 3
    .param p1    # Landroid/support/v7/media/MediaRouteSelector;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "selector must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Landroid/support/v7/app/MediaRouteChooserDialog;->mSelector:Landroid/support/v7/media/MediaRouteSelector;

    invoke-virtual {v0, p1}, Landroid/support/v7/media/MediaRouteSelector;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iput-object p1, p0, Landroid/support/v7/app/MediaRouteChooserDialog;->mSelector:Landroid/support/v7/media/MediaRouteSelector;

    iget-boolean v0, p0, Landroid/support/v7/app/MediaRouteChooserDialog;->mAttachedToWindow:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteChooserDialog;->mRouter:Landroid/support/v7/media/MediaRouter;

    iget-object v1, p0, Landroid/support/v7/app/MediaRouteChooserDialog;->mCallback:Landroid/support/v7/app/MediaRouteChooserDialog$MediaRouterCallback;

    invoke-virtual {v0, v1}, Landroid/support/v7/media/MediaRouter;->removeCallback(Landroid/support/v7/media/MediaRouter$Callback;)V

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteChooserDialog;->mRouter:Landroid/support/v7/media/MediaRouter;

    iget-object v1, p0, Landroid/support/v7/app/MediaRouteChooserDialog;->mCallback:Landroid/support/v7/app/MediaRouteChooserDialog$MediaRouterCallback;

    const/4 v2, 0x1

    invoke-virtual {v0, p1, v1, v2}, Landroid/support/v7/media/MediaRouter;->addCallback(Landroid/support/v7/media/MediaRouteSelector;Landroid/support/v7/media/MediaRouter$Callback;I)V

    :cond_1
    invoke-virtual {p0}, Landroid/support/v7/app/MediaRouteChooserDialog;->refreshRoutes()V

    :cond_2
    return-void
.end method

.method updateLayout()V
    .locals 3

    invoke-virtual {p0}, Landroid/support/v7/app/MediaRouteChooserDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {p0}, Landroid/support/v7/app/MediaRouteChooserDialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/support/v7/app/MediaRouteDialogHelper;->getDialogWidth(Landroid/content/Context;)I

    move-result v1

    const/4 v2, -0x2

    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setLayout(II)V

    return-void
.end method
