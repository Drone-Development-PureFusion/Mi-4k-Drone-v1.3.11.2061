.class final Lcom/google/ads/mediation/customevent/CustomEventAdapter$a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/ads/mediation/customevent/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/ads/mediation/customevent/CustomEventAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/google/ads/mediation/customevent/CustomEventAdapter;

.field private final b:Lcom/google/ads/mediation/f;


# direct methods
.method public constructor <init>(Lcom/google/ads/mediation/customevent/CustomEventAdapter;Lcom/google/ads/mediation/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$a;->a:Lcom/google/ads/mediation/customevent/CustomEventAdapter;

    iput-object p2, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$a;->b:Lcom/google/ads/mediation/f;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    const-string v0, "Custom event adapter called onFailedToReceiveAd."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/b;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$a;->b:Lcom/google/ads/mediation/f;

    iget-object v1, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$a;->a:Lcom/google/ads/mediation/customevent/CustomEventAdapter;

    sget-object v2, Lcom/google/ads/a$a;->b:Lcom/google/ads/a$a;

    invoke-interface {v0, v1, v2}, Lcom/google/ads/mediation/f;->a(Lcom/google/ads/mediation/e;Lcom/google/ads/a$a;)V

    return-void
.end method

.method public a(Landroid/view/View;)V
    .locals 2

    const-string v0, "Custom event adapter called onReceivedAd."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/b;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$a;->a:Lcom/google/ads/mediation/customevent/CustomEventAdapter;

    invoke-static {v0, p1}, Lcom/google/ads/mediation/customevent/CustomEventAdapter;->a(Lcom/google/ads/mediation/customevent/CustomEventAdapter;Landroid/view/View;)V

    iget-object v0, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$a;->b:Lcom/google/ads/mediation/f;

    iget-object v1, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$a;->a:Lcom/google/ads/mediation/customevent/CustomEventAdapter;

    invoke-interface {v0, v1}, Lcom/google/ads/mediation/f;->a(Lcom/google/ads/mediation/e;)V

    return-void
.end method

.method public b()V
    .locals 2

    const-string v0, "Custom event adapter called onFailedToReceiveAd."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/b;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$a;->b:Lcom/google/ads/mediation/f;

    iget-object v1, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$a;->a:Lcom/google/ads/mediation/customevent/CustomEventAdapter;

    invoke-interface {v0, v1}, Lcom/google/ads/mediation/f;->e(Lcom/google/ads/mediation/e;)V

    return-void
.end method

.method public c()V
    .locals 2

    const-string v0, "Custom event adapter called onFailedToReceiveAd."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/b;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$a;->b:Lcom/google/ads/mediation/f;

    iget-object v1, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$a;->a:Lcom/google/ads/mediation/customevent/CustomEventAdapter;

    invoke-interface {v0, v1}, Lcom/google/ads/mediation/f;->b(Lcom/google/ads/mediation/e;)V

    return-void
.end method

.method public d()V
    .locals 2

    const-string v0, "Custom event adapter called onFailedToReceiveAd."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/b;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$a;->b:Lcom/google/ads/mediation/f;

    iget-object v1, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$a;->a:Lcom/google/ads/mediation/customevent/CustomEventAdapter;

    invoke-interface {v0, v1}, Lcom/google/ads/mediation/f;->c(Lcom/google/ads/mediation/e;)V

    return-void
.end method

.method public e()V
    .locals 2

    const-string v0, "Custom event adapter called onFailedToReceiveAd."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/b;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$a;->b:Lcom/google/ads/mediation/f;

    iget-object v1, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$a;->a:Lcom/google/ads/mediation/customevent/CustomEventAdapter;

    invoke-interface {v0, v1}, Lcom/google/ads/mediation/f;->d(Lcom/google/ads/mediation/e;)V

    return-void
.end method
