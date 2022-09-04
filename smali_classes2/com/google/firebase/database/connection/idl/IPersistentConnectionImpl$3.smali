.class final Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$3;
.super Lcom/google/firebase/database/connection/idl/i$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl;->a(Lcom/google/android/gms/internal/hr$a;)Lcom/google/firebase/database/connection/idl/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/hr$a;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/hr$a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$3;->a:Lcom/google/android/gms/internal/hr$a;

    invoke-direct {p0}, Lcom/google/firebase/database/connection/idl/i$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$3;->a:Lcom/google/android/gms/internal/hr$a;

    invoke-interface {v0}, Lcom/google/android/gms/internal/hr$a;->a()V

    return-void
.end method

.method public a(Lcom/google/android/gms/c/e;)V
    .locals 2

    iget-object v1, p0, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$3;->a:Lcom/google/android/gms/internal/hr$a;

    invoke-static {p1}, Lcom/google/android/gms/c/f;->a(Lcom/google/android/gms/c/e;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/hr$a;->a(Ljava/util/Map;)V

    return-void
.end method

.method public a(Ljava/util/List;Lcom/google/android/gms/c/e;ZJ)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/c/e;",
            "ZJ)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$3;->a:Lcom/google/android/gms/internal/hr$a;

    invoke-static {p2}, Lcom/google/android/gms/c/f;->a(Lcom/google/android/gms/c/e;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p4, p5}, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl;->a(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, p1, v1, p3, v2}, Lcom/google/android/gms/internal/hr$a;->a(Ljava/util/List;Ljava/lang/Object;ZLjava/lang/Long;)V

    return-void
.end method

.method public a(Ljava/util/List;Ljava/util/List;Lcom/google/android/gms/c/e;J)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/google/firebase/database/connection/idl/RangeParcelable;",
            ">;",
            "Lcom/google/android/gms/c/e;",
            "J)V"
        }
    .end annotation

    invoke-static {p3}, Lcom/google/android/gms/c/f;->a(Lcom/google/android/gms/c/e;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge v2, v1, :cond_0

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/firebase/database/connection/idl/RangeParcelable;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v1, v4}, Lcom/google/firebase/database/connection/idl/RangeParcelable;->a(Lcom/google/firebase/database/connection/idl/RangeParcelable;Ljava/lang/Object;)Lcom/google/android/gms/internal/ht;

    move-result-object v1

    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$3;->a:Lcom/google/android/gms/internal/hr$a;

    invoke-static {p4, p5}, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl;->a(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, p1, v3, v1}, Lcom/google/android/gms/internal/hr$a;->a(Ljava/util/List;Ljava/util/List;Ljava/lang/Long;)V

    return-void
.end method

.method public a(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$3;->a:Lcom/google/android/gms/internal/hr$a;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/hr$a;->a(Z)V

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$3;->a:Lcom/google/android/gms/internal/hr$a;

    invoke-interface {v0}, Lcom/google/android/gms/internal/hr$a;->b()V

    return-void
.end method
