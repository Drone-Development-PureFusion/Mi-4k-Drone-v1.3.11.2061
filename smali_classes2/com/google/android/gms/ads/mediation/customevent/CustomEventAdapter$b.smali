.class Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/ads/mediation/customevent/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;

.field private final b:Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;

.field private final c:Lcom/google/android/gms/ads/mediation/f;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;Lcom/google/android/gms/ads/mediation/f;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$b;->a:Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$b;->b:Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;

    iput-object p3, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$b;->c:Lcom/google/android/gms/ads/mediation/f;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    const-string v0, "Custom event adapter called onAdClicked."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/b;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$b;->c:Lcom/google/android/gms/ads/mediation/f;

    iget-object v1, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$b;->b:Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/mediation/f;->e(Lcom/google/android/gms/ads/mediation/e;)V

    return-void
.end method

.method public a(I)V
    .locals 2

    const-string v0, "Custom event adapter called onFailedToReceiveAd."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/b;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$b;->c:Lcom/google/android/gms/ads/mediation/f;

    iget-object v1, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$b;->b:Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/ads/mediation/f;->a(Lcom/google/android/gms/ads/mediation/e;I)V

    return-void
.end method

.method public b()V
    .locals 2

    const-string v0, "Custom event adapter called onAdOpened."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/b;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$b;->c:Lcom/google/android/gms/ads/mediation/f;

    iget-object v1, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$b;->b:Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/mediation/f;->b(Lcom/google/android/gms/ads/mediation/e;)V

    return-void
.end method

.method public c()V
    .locals 2

    const-string v0, "Custom event adapter called onAdClosed."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/b;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$b;->c:Lcom/google/android/gms/ads/mediation/f;

    iget-object v1, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$b;->b:Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/mediation/f;->c(Lcom/google/android/gms/ads/mediation/e;)V

    return-void
.end method

.method public d()V
    .locals 2

    const-string v0, "Custom event adapter called onAdLeftApplication."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/b;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$b;->c:Lcom/google/android/gms/ads/mediation/f;

    iget-object v1, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$b;->b:Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/mediation/f;->d(Lcom/google/android/gms/ads/mediation/e;)V

    return-void
.end method

.method public e()V
    .locals 2

    const-string v0, "Custom event adapter called onReceivedAd."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/b;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$b;->c:Lcom/google/android/gms/ads/mediation/f;

    iget-object v1, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$b;->a:Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/mediation/f;->a(Lcom/google/android/gms/ads/mediation/e;)V

    return-void
.end method
