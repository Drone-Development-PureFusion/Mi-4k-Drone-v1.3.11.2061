.class public final Lcom/google/android/gms/maps/c;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/maps/c$u;,
        Lcom/google/android/gms/maps/c$y;,
        Lcom/google/android/gms/maps/c$i;,
        Lcom/google/android/gms/maps/c$o;,
        Lcom/google/android/gms/maps/c$s;,
        Lcom/google/android/gms/maps/c$t;,
        Lcom/google/android/gms/maps/c$b;,
        Lcom/google/android/gms/maps/c$x;,
        Lcom/google/android/gms/maps/c$a;,
        Lcom/google/android/gms/maps/c$l;,
        Lcom/google/android/gms/maps/c$m;,
        Lcom/google/android/gms/maps/c$k;,
        Lcom/google/android/gms/maps/c$r;,
        Lcom/google/android/gms/maps/c$q;,
        Lcom/google/android/gms/maps/c$w;,
        Lcom/google/android/gms/maps/c$v;,
        Lcom/google/android/gms/maps/c$h;,
        Lcom/google/android/gms/maps/c$c;,
        Lcom/google/android/gms/maps/c$d;,
        Lcom/google/android/gms/maps/c$e;,
        Lcom/google/android/gms/maps/c$f;,
        Lcom/google/android/gms/maps/c$g;,
        Lcom/google/android/gms/maps/c$p;,
        Lcom/google/android/gms/maps/c$n;,
        Lcom/google/android/gms/maps/c$j;
    }
.end annotation


# static fields
.field public static final a:I = 0x0

.field public static final b:I = 0x1

.field public static final c:I = 0x2

.field public static final d:I = 0x3

.field public static final e:I = 0x4


# instance fields
.field private final f:Lcom/google/android/gms/maps/a/b;

.field private g:Lcom/google/android/gms/maps/j;


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/maps/a/b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/a/b;

    iput-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/maps/model/CameraPosition;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    invoke-interface {v0}, Lcom/google/android/gms/maps/a/b;->a()Lcom/google/android/gms/maps/model/CameraPosition;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final a(Lcom/google/android/gms/maps/model/CircleOptions;)Lcom/google/android/gms/maps/model/c;
    .locals 2

    :try_start_0
    new-instance v0, Lcom/google/android/gms/maps/model/c;

    iget-object v1, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    invoke-interface {v1, p1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/model/CircleOptions;)Lcom/google/android/gms/maps/model/a/c;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/maps/model/c;-><init>(Lcom/google/android/gms/maps/model/a/c;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final a(Lcom/google/android/gms/maps/model/GroundOverlayOptions;)Lcom/google/android/gms/maps/model/d;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/model/GroundOverlayOptions;)Lcom/google/android/gms/maps/model/a/d;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v0, Lcom/google/android/gms/maps/model/d;

    invoke-direct {v0, v1}, Lcom/google/android/gms/maps/model/d;-><init>(Lcom/google/android/gms/maps/model/a/d;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final a(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/g;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/a/g;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v0, Lcom/google/android/gms/maps/model/g;

    invoke-direct {v0, v1}, Lcom/google/android/gms/maps/model/g;-><init>(Lcom/google/android/gms/maps/model/a/g;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final a(Lcom/google/android/gms/maps/model/PolygonOptions;)Lcom/google/android/gms/maps/model/h;
    .locals 2

    :try_start_0
    new-instance v0, Lcom/google/android/gms/maps/model/h;

    iget-object v1, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    invoke-interface {v1, p1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/model/PolygonOptions;)Lcom/google/android/gms/maps/model/a/h;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/maps/model/h;-><init>(Lcom/google/android/gms/maps/model/a/h;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final a(Lcom/google/android/gms/maps/model/PolylineOptions;)Lcom/google/android/gms/maps/model/i;
    .locals 2

    :try_start_0
    new-instance v0, Lcom/google/android/gms/maps/model/i;

    iget-object v1, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    invoke-interface {v1, p1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/model/PolylineOptions;)Lcom/google/android/gms/maps/model/a/a;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/maps/model/i;-><init>(Lcom/google/android/gms/maps/model/a/a;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final a(Lcom/google/android/gms/maps/model/TileOverlayOptions;)Lcom/google/android/gms/maps/model/k;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/model/TileOverlayOptions;)Lcom/google/android/gms/maps/model/a/i;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v0, Lcom/google/android/gms/maps/model/k;

    invoke-direct {v0, v1}, Lcom/google/android/gms/maps/model/k;-><init>(Lcom/google/android/gms/maps/model/a/i;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public a(F)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/a/b;->a(F)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final a(I)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/a/b;->a(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final a(IIII)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/google/android/gms/maps/a/b;->a(IIII)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final a(Lcom/google/android/gms/maps/a;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    invoke-virtual {p1}, Lcom/google/android/gms/maps/a;->a()Lcom/google/android/gms/c/e;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/c/e;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final a(Lcom/google/android/gms/maps/a;ILcom/google/android/gms/maps/c$a;)V
    .locals 3

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    invoke-virtual {p1}, Lcom/google/android/gms/maps/a;->a()Lcom/google/android/gms/c/e;

    move-result-object v2

    if-nez p3, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-interface {v1, v2, p2, v0}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/c/e;ILcom/google/android/gms/maps/a/w;)V

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/maps/c$y;

    invoke-direct {v0, p3}, Lcom/google/android/gms/maps/c$y;-><init>(Lcom/google/android/gms/maps/c$a;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final a(Lcom/google/android/gms/maps/a;Lcom/google/android/gms/maps/c$a;)V
    .locals 3

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    invoke-virtual {p1}, Lcom/google/android/gms/maps/a;->a()Lcom/google/android/gms/c/e;

    move-result-object v2

    if-nez p2, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-interface {v1, v2, v0}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/c/e;Lcom/google/android/gms/maps/a/w;)V

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/maps/c$y;

    invoke-direct {v0, p2}, Lcom/google/android/gms/maps/c$y;-><init>(Lcom/google/android/gms/maps/c$a;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final a(Lcom/google/android/gms/maps/c$b;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/y;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    new-instance v1, Lcom/google/android/gms/maps/c$22;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/maps/c$22;-><init>(Lcom/google/android/gms/maps/c;Lcom/google/android/gms/maps/c$b;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/y;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final a(Lcom/google/android/gms/maps/c$c;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-nez p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/z;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    new-instance v1, Lcom/google/android/gms/maps/c$10;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/maps/c$10;-><init>(Lcom/google/android/gms/maps/c;Lcom/google/android/gms/maps/c$c;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/z;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final a(Lcom/google/android/gms/maps/c$d;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/aa;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    new-instance v1, Lcom/google/android/gms/maps/c$15;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/maps/c$15;-><init>(Lcom/google/android/gms/maps/c;Lcom/google/android/gms/maps/c$d;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/aa;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final a(Lcom/google/android/gms/maps/c$e;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/ab;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    new-instance v1, Lcom/google/android/gms/maps/c$14;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/maps/c$14;-><init>(Lcom/google/android/gms/maps/c;Lcom/google/android/gms/maps/c$e;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/ab;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final a(Lcom/google/android/gms/maps/c$f;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/ac;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    new-instance v1, Lcom/google/android/gms/maps/c$13;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/maps/c$13;-><init>(Lcom/google/android/gms/maps/c;Lcom/google/android/gms/maps/c$f;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/ac;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final a(Lcom/google/android/gms/maps/c$g;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/ad;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    new-instance v1, Lcom/google/android/gms/maps/c$11;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/maps/c$11;-><init>(Lcom/google/android/gms/maps/c;Lcom/google/android/gms/maps/c$g;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/ad;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final a(Lcom/google/android/gms/maps/c$h;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/ae;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    new-instance v1, Lcom/google/android/gms/maps/c$5;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/maps/c$5;-><init>(Lcom/google/android/gms/maps/c;Lcom/google/android/gms/maps/c$h;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/ae;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final a(Lcom/google/android/gms/maps/c$i;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/af;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    new-instance v1, Lcom/google/android/gms/maps/c$3;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/maps/c$3;-><init>(Lcom/google/android/gms/maps/c;Lcom/google/android/gms/maps/c$i;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/af;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final a(Lcom/google/android/gms/maps/c$j;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/ag;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    new-instance v1, Lcom/google/android/gms/maps/c$1;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/maps/c$1;-><init>(Lcom/google/android/gms/maps/c;Lcom/google/android/gms/maps/c$j;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/ag;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final a(Lcom/google/android/gms/maps/c$k;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/ah;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    new-instance v1, Lcom/google/android/gms/maps/c$19;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/maps/c$19;-><init>(Lcom/google/android/gms/maps/c;Lcom/google/android/gms/maps/c$k;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/ah;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final a(Lcom/google/android/gms/maps/c$l;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/ai;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    new-instance v1, Lcom/google/android/gms/maps/c$21;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/maps/c$21;-><init>(Lcom/google/android/gms/maps/c;Lcom/google/android/gms/maps/c$l;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/ai;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final a(Lcom/google/android/gms/maps/c$m;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/aj;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    new-instance v1, Lcom/google/android/gms/maps/c$20;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/maps/c$20;-><init>(Lcom/google/android/gms/maps/c;Lcom/google/android/gms/maps/c$m;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/aj;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final a(Lcom/google/android/gms/maps/c$n;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/al;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    new-instance v1, Lcom/google/android/gms/maps/c$16;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/maps/c$16;-><init>(Lcom/google/android/gms/maps/c;Lcom/google/android/gms/maps/c$n;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/al;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public a(Lcom/google/android/gms/maps/c$o;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/am;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    new-instance v1, Lcom/google/android/gms/maps/c$2;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/maps/c$2;-><init>(Lcom/google/android/gms/maps/c;Lcom/google/android/gms/maps/c$o;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/am;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final a(Lcom/google/android/gms/maps/c$p;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/an;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    new-instance v1, Lcom/google/android/gms/maps/c$17;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/maps/c$17;-><init>(Lcom/google/android/gms/maps/c;Lcom/google/android/gms/maps/c$p;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/an;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final a(Lcom/google/android/gms/maps/c$q;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/ap;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    new-instance v1, Lcom/google/android/gms/maps/c$12;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/maps/c$12;-><init>(Lcom/google/android/gms/maps/c;Lcom/google/android/gms/maps/c$q;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/ap;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final a(Lcom/google/android/gms/maps/c$r;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/aq;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    new-instance v1, Lcom/google/android/gms/maps/c$18;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/maps/c$18;-><init>(Lcom/google/android/gms/maps/c;Lcom/google/android/gms/maps/c$r;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/aq;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final a(Lcom/google/android/gms/maps/c$s;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/ar;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    new-instance v1, Lcom/google/android/gms/maps/c$24;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/maps/c$24;-><init>(Lcom/google/android/gms/maps/c;Lcom/google/android/gms/maps/c$s;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/ar;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final a(Lcom/google/android/gms/maps/c$t;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-nez p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/as;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    new-instance v1, Lcom/google/android/gms/maps/c$23;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/maps/c$23;-><init>(Lcom/google/android/gms/maps/c;Lcom/google/android/gms/maps/c$t;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/as;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final a(Lcom/google/android/gms/maps/c$u;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/at;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    new-instance v1, Lcom/google/android/gms/maps/c$9;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/maps/c$9;-><init>(Lcom/google/android/gms/maps/c;Lcom/google/android/gms/maps/c$u;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/at;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final a(Lcom/google/android/gms/maps/c$v;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/au;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    new-instance v1, Lcom/google/android/gms/maps/c$6;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/maps/c$6;-><init>(Lcom/google/android/gms/maps/c;Lcom/google/android/gms/maps/c$v;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/au;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final a(Lcom/google/android/gms/maps/c$w;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/n;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    new-instance v1, Lcom/google/android/gms/maps/c$7;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/maps/c$7;-><init>(Lcom/google/android/gms/maps/c;Lcom/google/android/gms/maps/c$w;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/n;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final a(Lcom/google/android/gms/maps/c$x;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/c$x;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/maps/c$x;Landroid/graphics/Bitmap;)V
    .locals 3

    if-eqz p2, :cond_0

    invoke-static {p2}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v0

    :goto_0
    check-cast v0, Lcom/google/android/gms/c/f;

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    new-instance v2, Lcom/google/android/gms/maps/c$8;

    invoke-direct {v2, p0, p1}, Lcom/google/android/gms/maps/c$8;-><init>(Lcom/google/android/gms/maps/c;Lcom/google/android/gms/maps/c$x;)V

    invoke-interface {v1, v2, v0}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/t;Lcom/google/android/gms/c/e;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final a(Lcom/google/android/gms/maps/d;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/c;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    new-instance v1, Lcom/google/android/gms/maps/c$4;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/maps/c$4;-><init>(Lcom/google/android/gms/maps/c;Lcom/google/android/gms/maps/d;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/a/c;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public a(Lcom/google/android/gms/maps/model/LatLngBounds;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/model/LatLngBounds;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final a(Ljava/lang/String;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/a/b;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final a(Z)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/a/b;->a(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public a(Lcom/google/android/gms/maps/model/MapStyleOptions;)Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/a/b;->a(Lcom/google/android/gms/maps/model/MapStyleOptions;)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final b()F
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    invoke-interface {v0}, Lcom/google/android/gms/maps/a/b;->b()F
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public b(F)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/a/b;->b(F)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final b(Lcom/google/android/gms/maps/a;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    invoke-virtual {p1}, Lcom/google/android/gms/maps/a;->a()Lcom/google/android/gms/c/e;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/b;->b(Lcom/google/android/gms/c/e;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final b(Z)Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/a/b;->b(Z)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final c()F
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    invoke-interface {v0}, Lcom/google/android/gms/maps/a/b;->c()F
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final c(Z)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/a/b;->d(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final d()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    invoke-interface {v0}, Lcom/google/android/gms/maps/a/b;->d()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final d(Z)V
    .locals 2
    .annotation build Landroid/support/annotation/RequiresPermission;
        anyOf = {
            "android.permission.ACCESS_COARSE_LOCATION",
            "android.permission.ACCESS_FINE_LOCATION"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/a/b;->c(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final e()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    invoke-interface {v0}, Lcom/google/android/gms/maps/a/b;->e()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public f()Lcom/google/android/gms/maps/model/e;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    invoke-interface {v0}, Lcom/google/android/gms/maps/a/b;->n()Lcom/google/android/gms/maps/model/a/e;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v0, Lcom/google/android/gms/maps/model/e;

    invoke-direct {v0, v1}, Lcom/google/android/gms/maps/model/e;-><init>(Lcom/google/android/gms/maps/model/a/e;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final g()I
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    invoke-interface {v0}, Lcom/google/android/gms/maps/a/b;->f()I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final h()Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    invoke-interface {v0}, Lcom/google/android/gms/maps/a/b;->g()Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final i()Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    invoke-interface {v0}, Lcom/google/android/gms/maps/a/b;->h()Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final j()Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    invoke-interface {v0}, Lcom/google/android/gms/maps/a/b;->m()Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final k()Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    invoke-interface {v0}, Lcom/google/android/gms/maps/a/b;->i()Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final l()Landroid/location/Location;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    invoke-interface {v0}, Lcom/google/android/gms/maps/a/b;->j()Landroid/location/Location;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final m()Lcom/google/android/gms/maps/j;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->g:Lcom/google/android/gms/maps/j;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/maps/j;

    iget-object v1, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    invoke-interface {v1}, Lcom/google/android/gms/maps/a/b;->k()Lcom/google/android/gms/maps/a/j;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/maps/j;-><init>(Lcom/google/android/gms/maps/a/j;)V

    iput-object v0, p0, Lcom/google/android/gms/maps/c;->g:Lcom/google/android/gms/maps/j;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->g:Lcom/google/android/gms/maps/j;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final n()Lcom/google/android/gms/maps/h;
    .locals 2

    :try_start_0
    new-instance v0, Lcom/google/android/gms/maps/h;

    iget-object v1, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    invoke-interface {v1}, Lcom/google/android/gms/maps/a/b;->l()Lcom/google/android/gms/maps/a/f;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/maps/h;-><init>(Lcom/google/android/gms/maps/a/f;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public o()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c;->f:Lcom/google/android/gms/maps/a/b;

    invoke-interface {v0}, Lcom/google/android/gms/maps/a/b;->u()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method
