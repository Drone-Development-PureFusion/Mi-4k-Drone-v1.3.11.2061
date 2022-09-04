.class Lcom/google/ads/mediation/customevent/CustomEventAdapter$b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/ads/mediation/customevent/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/ads/mediation/customevent/CustomEventAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/ads/mediation/customevent/CustomEventAdapter;

.field private final b:Lcom/google/ads/mediation/customevent/CustomEventAdapter;

.field private final c:Lcom/google/ads/mediation/h;


# direct methods
.method public constructor <init>(Lcom/google/ads/mediation/customevent/CustomEventAdapter;Lcom/google/ads/mediation/customevent/CustomEventAdapter;Lcom/google/ads/mediation/h;)V
    .locals 0

    iput-object p1, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$b;->a:Lcom/google/ads/mediation/customevent/CustomEventAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$b;->b:Lcom/google/ads/mediation/customevent/CustomEventAdapter;

    iput-object p3, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$b;->c:Lcom/google/ads/mediation/h;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    const-string v0, "Custom event adapter called onFailedToReceiveAd."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/b;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$b;->c:Lcom/google/ads/mediation/h;

    iget-object v1, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$b;->b:Lcom/google/ads/mediation/customevent/CustomEventAdapter;

    sget-object v2, Lcom/google/ads/a$a;->b:Lcom/google/ads/a$a;

    invoke-interface {v0, v1, v2}, Lcom/google/ads/mediation/h;->a(Lcom/google/ads/mediation/g;Lcom/google/ads/a$a;)V

    return-void
.end method

.method public b()V
    .locals 2

    const-string v0, "Custom event adapter called onReceivedAd."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/b;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$b;->c:Lcom/google/ads/mediation/h;

    iget-object v1, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$b;->a:Lcom/google/ads/mediation/customevent/CustomEventAdapter;

    invoke-interface {v0, v1}, Lcom/google/ads/mediation/h;->a(Lcom/google/ads/mediation/g;)V

    return-void
.end method

.method public c()V
    .locals 2

    const-string v0, "Custom event adapter called onPresentScreen."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/b;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$b;->c:Lcom/google/ads/mediation/h;

    iget-object v1, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$b;->b:Lcom/google/ads/mediation/customevent/CustomEventAdapter;

    invoke-interface {v0, v1}, Lcom/google/ads/mediation/h;->b(Lcom/google/ads/mediation/g;)V

    return-void
.end method

.method public d()V
    .locals 2

    const-string v0, "Custom event adapter called onDismissScreen."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/b;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$b;->c:Lcom/google/ads/mediation/h;

    iget-object v1, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$b;->b:Lcom/google/ads/mediation/customevent/CustomEventAdapter;

    invoke-interface {v0, v1}, Lcom/google/ads/mediation/h;->c(Lcom/google/ads/mediation/g;)V

    return-void
.end method

.method public e()V
    .locals 2

    const-string v0, "Custom event adapter called onLeaveApplication."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/b;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$b;->c:Lcom/google/ads/mediation/h;

    iget-object v1, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$b;->b:Lcom/google/ads/mediation/customevent/CustomEventAdapter;

    invoke-interface {v0, v1}, Lcom/google/ads/mediation/h;->d(Lcom/google/ads/mediation/g;)V

    return-void
.end method
