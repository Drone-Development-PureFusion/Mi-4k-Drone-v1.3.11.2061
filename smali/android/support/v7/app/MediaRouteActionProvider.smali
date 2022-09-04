.class public Landroid/support/v7/app/MediaRouteActionProvider;
.super Landroid/support/v4/view/ActionProvider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/app/MediaRouteActionProvider$MediaRouterCallback;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "MediaRouteActionProvider"


# instance fields
.field private mButton:Landroid/support/v7/app/MediaRouteButton;

.field private final mCallback:Landroid/support/v7/app/MediaRouteActionProvider$MediaRouterCallback;

.field private mDialogFactory:Landroid/support/v7/app/MediaRouteDialogFactory;

.field private final mRouter:Landroid/support/v7/media/MediaRouter;

.field private mSelector:Landroid/support/v7/media/MediaRouteSelector;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/support/v4/view/ActionProvider;-><init>(Landroid/content/Context;)V

    sget-object v0, Landroid/support/v7/media/MediaRouteSelector;->EMPTY:Landroid/support/v7/media/MediaRouteSelector;

    iput-object v0, p0, Landroid/support/v7/app/MediaRouteActionProvider;->mSelector:Landroid/support/v7/media/MediaRouteSelector;

    invoke-static {}, Landroid/support/v7/app/MediaRouteDialogFactory;->getDefault()Landroid/support/v7/app/MediaRouteDialogFactory;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/app/MediaRouteActionProvider;->mDialogFactory:Landroid/support/v7/app/MediaRouteDialogFactory;

    invoke-static {p1}, Landroid/support/v7/media/MediaRouter;->getInstance(Landroid/content/Context;)Landroid/support/v7/media/MediaRouter;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/app/MediaRouteActionProvider;->mRouter:Landroid/support/v7/media/MediaRouter;

    new-instance v0, Landroid/support/v7/app/MediaRouteActionProvider$MediaRouterCallback;

    invoke-direct {v0, p0}, Landroid/support/v7/app/MediaRouteActionProvider$MediaRouterCallback;-><init>(Landroid/support/v7/app/MediaRouteActionProvider;)V

    iput-object v0, p0, Landroid/support/v7/app/MediaRouteActionProvider;->mCallback:Landroid/support/v7/app/MediaRouteActionProvider$MediaRouterCallback;

    return-void
.end method

.method static synthetic access$000(Landroid/support/v7/app/MediaRouteActionProvider;)V
    .locals 0

    invoke-direct {p0}, Landroid/support/v7/app/MediaRouteActionProvider;->refreshRoute()V

    return-void
.end method

.method private refreshRoute()V
    .locals 0

    invoke-virtual {p0}, Landroid/support/v7/app/MediaRouteActionProvider;->refreshVisibility()V

    return-void
.end method


# virtual methods
.method public getDialogFactory()Landroid/support/v7/app/MediaRouteDialogFactory;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteActionProvider;->mDialogFactory:Landroid/support/v7/app/MediaRouteDialogFactory;

    return-object v0
.end method

.method public getMediaRouteButton()Landroid/support/v7/app/MediaRouteButton;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteActionProvider;->mButton:Landroid/support/v7/app/MediaRouteButton;

    return-object v0
.end method

.method public getRouteSelector()Landroid/support/v7/media/MediaRouteSelector;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteActionProvider;->mSelector:Landroid/support/v7/media/MediaRouteSelector;

    return-object v0
.end method

.method public isVisible()Z
    .locals 3

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteActionProvider;->mRouter:Landroid/support/v7/media/MediaRouter;

    iget-object v1, p0, Landroid/support/v7/app/MediaRouteActionProvider;->mSelector:Landroid/support/v7/media/MediaRouteSelector;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/media/MediaRouter;->isRouteAvailable(Landroid/support/v7/media/MediaRouteSelector;I)Z

    move-result v0

    return v0
.end method

.method public onCreateActionView()Landroid/view/View;
    .locals 4

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteActionProvider;->mButton:Landroid/support/v7/app/MediaRouteButton;

    if-eqz v0, :cond_0

    const-string v0, "MediaRouteActionProvider"

    const-string v1, "onCreateActionView: this ActionProvider is already associated with a menu item. Don\'t reuse MediaRouteActionProvider instances! Abandoning the old menu item..."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/app/MediaRouteActionProvider;->onCreateMediaRouteButton()Landroid/support/v7/app/MediaRouteButton;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/app/MediaRouteActionProvider;->mButton:Landroid/support/v7/app/MediaRouteButton;

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteActionProvider;->mButton:Landroid/support/v7/app/MediaRouteButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/app/MediaRouteButton;->setCheatSheetEnabled(Z)V

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteActionProvider;->mButton:Landroid/support/v7/app/MediaRouteButton;

    iget-object v1, p0, Landroid/support/v7/app/MediaRouteActionProvider;->mSelector:Landroid/support/v7/media/MediaRouteSelector;

    invoke-virtual {v0, v1}, Landroid/support/v7/app/MediaRouteButton;->setRouteSelector(Landroid/support/v7/media/MediaRouteSelector;)V

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteActionProvider;->mButton:Landroid/support/v7/app/MediaRouteButton;

    iget-object v1, p0, Landroid/support/v7/app/MediaRouteActionProvider;->mDialogFactory:Landroid/support/v7/app/MediaRouteDialogFactory;

    invoke-virtual {v0, v1}, Landroid/support/v7/app/MediaRouteButton;->setDialogFactory(Landroid/support/v7/app/MediaRouteDialogFactory;)V

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteActionProvider;->mButton:Landroid/support/v7/app/MediaRouteButton;

    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x2

    const/4 v3, -0x1

    invoke-direct {v1, v2, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/support/v7/app/MediaRouteButton;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteActionProvider;->mButton:Landroid/support/v7/app/MediaRouteButton;

    return-object v0
.end method

.method public onCreateMediaRouteButton()Landroid/support/v7/app/MediaRouteButton;
    .locals 2

    new-instance v0, Landroid/support/v7/app/MediaRouteButton;

    invoke-virtual {p0}, Landroid/support/v7/app/MediaRouteActionProvider;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v7/app/MediaRouteButton;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public onPerformDefaultAction()Z
    .locals 1

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteActionProvider;->mButton:Landroid/support/v7/app/MediaRouteButton;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteActionProvider;->mButton:Landroid/support/v7/app/MediaRouteButton;

    invoke-virtual {v0}, Landroid/support/v7/app/MediaRouteButton;->showDialog()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public overridesItemVisibility()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public setDialogFactory(Landroid/support/v7/app/MediaRouteDialogFactory;)V
    .locals 2
    .param p1    # Landroid/support/v7/app/MediaRouteDialogFactory;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "factory must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Landroid/support/v7/app/MediaRouteActionProvider;->mDialogFactory:Landroid/support/v7/app/MediaRouteDialogFactory;

    if-eq v0, p1, :cond_1

    iput-object p1, p0, Landroid/support/v7/app/MediaRouteActionProvider;->mDialogFactory:Landroid/support/v7/app/MediaRouteDialogFactory;

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteActionProvider;->mButton:Landroid/support/v7/app/MediaRouteButton;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteActionProvider;->mButton:Landroid/support/v7/app/MediaRouteButton;

    invoke-virtual {v0, p1}, Landroid/support/v7/app/MediaRouteButton;->setDialogFactory(Landroid/support/v7/app/MediaRouteDialogFactory;)V

    :cond_1
    return-void
.end method

.method public setRouteSelector(Landroid/support/v7/media/MediaRouteSelector;)V
    .locals 2
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
    iget-object v0, p0, Landroid/support/v7/app/MediaRouteActionProvider;->mSelector:Landroid/support/v7/media/MediaRouteSelector;

    invoke-virtual {v0, p1}, Landroid/support/v7/media/MediaRouteSelector;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteActionProvider;->mSelector:Landroid/support/v7/media/MediaRouteSelector;

    invoke-virtual {v0}, Landroid/support/v7/media/MediaRouteSelector;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteActionProvider;->mRouter:Landroid/support/v7/media/MediaRouter;

    iget-object v1, p0, Landroid/support/v7/app/MediaRouteActionProvider;->mCallback:Landroid/support/v7/app/MediaRouteActionProvider$MediaRouterCallback;

    invoke-virtual {v0, v1}, Landroid/support/v7/media/MediaRouter;->removeCallback(Landroid/support/v7/media/MediaRouter$Callback;)V

    :cond_1
    invoke-virtual {p1}, Landroid/support/v7/media/MediaRouteSelector;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteActionProvider;->mRouter:Landroid/support/v7/media/MediaRouter;

    iget-object v1, p0, Landroid/support/v7/app/MediaRouteActionProvider;->mCallback:Landroid/support/v7/app/MediaRouteActionProvider$MediaRouterCallback;

    invoke-virtual {v0, p1, v1}, Landroid/support/v7/media/MediaRouter;->addCallback(Landroid/support/v7/media/MediaRouteSelector;Landroid/support/v7/media/MediaRouter$Callback;)V

    :cond_2
    iput-object p1, p0, Landroid/support/v7/app/MediaRouteActionProvider;->mSelector:Landroid/support/v7/media/MediaRouteSelector;

    invoke-direct {p0}, Landroid/support/v7/app/MediaRouteActionProvider;->refreshRoute()V

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteActionProvider;->mButton:Landroid/support/v7/app/MediaRouteButton;

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteActionProvider;->mButton:Landroid/support/v7/app/MediaRouteButton;

    invoke-virtual {v0, p1}, Landroid/support/v7/app/MediaRouteButton;->setRouteSelector(Landroid/support/v7/media/MediaRouteSelector;)V

    :cond_3
    return-void
.end method
