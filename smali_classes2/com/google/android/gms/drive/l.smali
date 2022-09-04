.class public abstract Lcom/google/android/gms/drive/l;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/data/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/common/data/f",
        "<",
        "Lcom/google/android/gms/drive/l;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:I = 0x0

.field public static final b:I = 0x1


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public A()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ajw;->r:Lcom/google/android/gms/drive/metadata/a;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/l;->a(Lcom/google/android/gms/drive/metadata/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0
.end method

.method public B()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ajw;->s:Lcom/google/android/gms/drive/metadata/a;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/l;->a(Lcom/google/android/gms/drive/metadata/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0
.end method

.method public C()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ajw;->E:Lcom/google/android/gms/internal/ajw$f;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/l;->a(Lcom/google/android/gms/drive/metadata/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0
.end method

.method public D()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ajw;->H:Lcom/google/android/gms/internal/ajw$h;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/l;->a(Lcom/google/android/gms/drive/metadata/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0
.end method

.method public E()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ajw;->v:Lcom/google/android/gms/drive/metadata/a;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/l;->a(Lcom/google/android/gms/drive/metadata/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0
.end method

.method public F()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ajw;->n:Lcom/google/android/gms/drive/metadata/a;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/l;->a(Lcom/google/android/gms/drive/metadata/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0
.end method

.method public G()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ajw;->w:Lcom/google/android/gms/drive/metadata/a;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/l;->a(Lcom/google/android/gms/drive/metadata/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0
.end method

.method public abstract a(Lcom/google/android/gms/drive/metadata/a;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/drive/metadata/a",
            "<TT;>;)TT;"
        }
    .end annotation
.end method

.method public c()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ajw;->b:Lcom/google/android/gms/drive/metadata/a;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/l;->a(Lcom/google/android/gms/drive/metadata/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public d()I
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/aka;->a:Lcom/google/android/gms/drive/metadata/a;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/l;->a(Lcom/google/android/gms/drive/metadata/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0
.end method

.method public e()Ljava/util/Date;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ajy;->a:Lcom/google/android/gms/internal/ajy$a;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/l;->a(Lcom/google/android/gms/drive/metadata/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Date;

    return-object v0
.end method

.method public f()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/drive/metadata/CustomPropertyKey;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/ajw;->c:Lcom/google/android/gms/internal/ajw$a;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/l;->a(Lcom/google/android/gms/drive/metadata/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/drive/metadata/internal/AppVisibleCustomProperties;

    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/drive/metadata/internal/AppVisibleCustomProperties;->a()Ljava/util/Map;

    move-result-object v0

    goto :goto_0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ajw;->d:Lcom/google/android/gms/drive/metadata/a;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/l;->a(Lcom/google/android/gms/drive/metadata/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public h()Lcom/google/android/gms/drive/DriveId;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ajw;->a:Lcom/google/android/gms/drive/metadata/a;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/l;->a(Lcom/google/android/gms/drive/metadata/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/drive/DriveId;

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ajw;->e:Lcom/google/android/gms/drive/metadata/a;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/l;->a(Lcom/google/android/gms/drive/metadata/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ajw;->f:Lcom/google/android/gms/drive/metadata/a;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/l;->a(Lcom/google/android/gms/drive/metadata/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public k()J
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ajw;->g:Lcom/google/android/gms/drive/metadata/a;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/l;->a(Lcom/google/android/gms/drive/metadata/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public l()Ljava/util/Date;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ajy;->b:Lcom/google/android/gms/internal/ajy$b;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/l;->a(Lcom/google/android/gms/drive/metadata/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Date;

    return-object v0
.end method

.method public m()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ajw;->x:Lcom/google/android/gms/internal/ajw$c;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/l;->a(Lcom/google/android/gms/drive/metadata/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public n()Ljava/util/Date;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ajy;->d:Lcom/google/android/gms/internal/ajy$c;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/l;->a(Lcom/google/android/gms/drive/metadata/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Date;

    return-object v0
.end method

.method public o()Ljava/util/Date;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ajy;->c:Lcom/google/android/gms/internal/ajy$d;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/l;->a(Lcom/google/android/gms/drive/metadata/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Date;

    return-object v0
.end method

.method public p()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ajw;->y:Lcom/google/android/gms/drive/metadata/a;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/l;->a(Lcom/google/android/gms/drive/metadata/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public q()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/aka;->b:Lcom/google/android/gms/drive/metadata/a;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/l;->a(Lcom/google/android/gms/drive/metadata/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0
.end method

.method public r()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ajw;->p:Lcom/google/android/gms/internal/ajw$b;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/l;->a(Lcom/google/android/gms/drive/metadata/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0
.end method

.method public s()J
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ajw;->D:Lcom/google/android/gms/internal/ajw$d;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/l;->a(Lcom/google/android/gms/drive/metadata/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public t()Ljava/util/Date;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ajy;->e:Lcom/google/android/gms/internal/ajy$f;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/l;->a(Lcom/google/android/gms/drive/metadata/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Date;

    return-object v0
.end method

.method public u()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ajw;->G:Lcom/google/android/gms/internal/ajw$g;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/l;->a(Lcom/google/android/gms/drive/metadata/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public v()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ajw;->I:Lcom/google/android/gms/drive/metadata/a;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/l;->a(Lcom/google/android/gms/drive/metadata/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public w()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ajw;->J:Lcom/google/android/gms/drive/metadata/a;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/l;->a(Lcom/google/android/gms/drive/metadata/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public x()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ajw;->k:Lcom/google/android/gms/drive/metadata/a;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/l;->a(Lcom/google/android/gms/drive/metadata/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0
.end method

.method public y()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ajw;->m:Lcom/google/android/gms/drive/metadata/a;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/l;->a(Lcom/google/android/gms/drive/metadata/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0
.end method

.method public z()Z
    .locals 2

    const-string v0, "application/vnd.google-apps.folder"

    invoke-virtual {p0}, Lcom/google/android/gms/drive/l;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
