.class public final Lcom/google/firebase/a/a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/a/a$c;,
        Lcom/google/firebase/a/a$b;,
        Lcom/google/firebase/a/a$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/measurement/internal/aj;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/aj;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/firebase/a/a;->a:Lcom/google/android/gms/measurement/internal/aj;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/google/firebase/a/a;
    .locals 1
    .annotation build Landroid/support/annotation/RequiresPermission;
        allOf = {
            "android.permission.INTERNET",
            "android.permission.ACCESS_NETWORK_STATE",
            "android.permission.WAKE_LOCK"
        }
    .end annotation

    invoke-static {p0}, Lcom/google/android/gms/measurement/internal/aj;->a(Landroid/content/Context;)Lcom/google/android/gms/measurement/internal/aj;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/aj;->n()Lcom/google/firebase/a/a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(J)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/a/a;->a:Lcom/google/android/gms/measurement/internal/aj;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/aj;->m()Lcom/google/android/gms/measurement/AppMeasurement;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/measurement/AppMeasurement;->a(J)V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/a/a;->a:Lcom/google/android/gms/measurement/internal/aj;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/aj;->m()Lcom/google/android/gms/measurement/AppMeasurement;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/measurement/AppMeasurement;->a(Ljava/lang/String;)V

    return-void
.end method

.method public a(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation

        .annotation build Landroid/support/annotation/Size;
            max = 0x20L
            min = 0x1L
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/firebase/a/a;->a:Lcom/google/android/gms/measurement/internal/aj;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/aj;->m()Lcom/google/android/gms/measurement/AppMeasurement;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/measurement/AppMeasurement;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation

        .annotation build Landroid/support/annotation/Size;
            max = 0x18L
            min = 0x1L
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation

        .annotation build Landroid/support/annotation/Size;
            max = 0x24L
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/firebase/a/a;->a:Lcom/google/android/gms/measurement/internal/aj;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/aj;->m()Lcom/google/android/gms/measurement/AppMeasurement;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/measurement/AppMeasurement;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public a(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/a/a;->a:Lcom/google/android/gms/measurement/internal/aj;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/aj;->m()Lcom/google/android/gms/measurement/AppMeasurement;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/measurement/AppMeasurement;->a(Z)V

    return-void
.end method

.method public b(J)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/a/a;->a:Lcom/google/android/gms/measurement/internal/aj;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/aj;->m()Lcom/google/android/gms/measurement/AppMeasurement;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/measurement/AppMeasurement;->b(J)V

    return-void
.end method
