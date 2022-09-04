.class public Lcom/fimi/soul/module/b/a/a/c;
.super Lcom/mob/tools/gui/PullToRequestListAdapter;

# interfaces
.implements Lcn/sharesdk/framework/PlatformActionListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fimi/soul/module/b/a/a/c$a;,
        Lcom/fimi/soul/module/b/a/a/c$b;
    }
.end annotation


# instance fields
.field private a:Lcom/fimi/soul/module/b/a/a/e;

.field private b:Z

.field private c:Lcn/sharesdk/framework/Platform;

.field private final d:I

.field private e:I

.field private f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/fimi/soul/module/b/a/a/c$b;",
            ">;"
        }
    .end annotation
.end field

.field private g:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private h:Lcom/fimi/soul/module/b/a/a/g;

.field private i:F


# direct methods
.method public constructor <init>(Lcom/fimi/soul/module/b/a/a/e;Lcom/mob/tools/gui/PullToRequestView;)V
    .locals 3

    invoke-direct {p0, p2}, Lcom/mob/tools/gui/PullToRequestListAdapter;-><init>(Lcom/mob/tools/gui/PullToRequestView;)V

    const/16 v0, 0xf

    iput v0, p0, Lcom/fimi/soul/module/b/a/a/c;->d:I

    iput-object p1, p0, Lcom/fimi/soul/module/b/a/a/c;->a:Lcom/fimi/soul/module/b/a/a/e;

    const/4 v0, -0x1

    iput v0, p0, Lcom/fimi/soul/module/b/a/a/c;->e:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/module/b/a/a/c;->b:Z

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/b/a/a/c;->g:Ljava/util/HashMap;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/b/a/a/c;->f:Ljava/util/ArrayList;

    invoke-virtual {p0}, Lcom/fimi/soul/module/b/a/a/c;->getListView()Landroid/widget/ListView;

    move-result-object v0

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    const v2, -0x151516

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/b/a/a/c;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/b/a/a/c;->e:I

    return v0
.end method

.method private a(Ljava/lang/String;Ljava/util/HashMap;Ljava/util/HashMap;)Lcom/fimi/soul/module/b/a/a/c$a;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;)",
            "Lcom/fimi/soul/module/b/a/a/c$a;"
        }
    .end annotation

    const/4 v4, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/util/HashMap;->size()I

    move-result v0

    if-gtz v0, :cond_1

    :cond_0
    move-object v0, v4

    :goto_0
    return-object v0

    :cond_1
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    const-string v0, "SinaWeibo"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, "users"

    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    const-string v6, "id"

    invoke-virtual {v0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p3, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2

    new-instance v7, Lcom/fimi/soul/module/b/a/a/c$b;

    invoke-direct {v7}, Lcom/fimi/soul/module/b/a/a/c$b;-><init>()V

    iput-object v6, v7, Lcom/fimi/soul/module/b/a/a/c$b;->d:Ljava/lang/String;

    const-string v6, "name"

    invoke-virtual {v0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v7, Lcom/fimi/soul/module/b/a/a/c$b;->b:Ljava/lang/String;

    const-string v6, "description"

    invoke-virtual {v0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v7, Lcom/fimi/soul/module/b/a/a/c$b;->c:Ljava/lang/String;

    const-string v6, "profile_image_url"

    invoke-virtual {v0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v7, Lcom/fimi/soul/module/b/a/a/c$b;->e:Ljava/lang/String;

    iget-object v0, v7, Lcom/fimi/soul/module/b/a/a/c$b;->b:Ljava/lang/String;

    iput-object v0, v7, Lcom/fimi/soul/module/b/a/a/c$b;->f:Ljava/lang/String;

    iget-object v0, v7, Lcom/fimi/soul/module/b/a/a/c$b;->d:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-virtual {p3, v0, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    const-string v0, "total_number"

    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p3}, Ljava/util/HashMap;->size()I

    move-result v3

    if-le v0, v3, :cond_5

    move v0, v2

    :goto_2
    move v1, v0

    :cond_4
    :goto_3
    new-instance v0, Lcom/fimi/soul/module/b/a/a/c$a;

    invoke-direct {v0, v4}, Lcom/fimi/soul/module/b/a/a/c$a;-><init>(Lcom/fimi/soul/module/b/a/a/c$1;)V

    iput-object v5, v0, Lcom/fimi/soul/module/b/a/a/c$a;->a:Ljava/util/ArrayList;

    iput-boolean v1, v0, Lcom/fimi/soul/module/b/a/a/c$a;->b:Z

    goto/16 :goto_0

    :cond_5
    move v0, v1

    goto :goto_2

    :cond_6
    const-string v0, "TencentWeibo"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    const-string v0, "hasnext"

    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_9

    move v3, v2

    :goto_4
    const-string v0, "info"

    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_7
    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    const-string v1, "name"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_7

    new-instance v7, Lcom/fimi/soul/module/b/a/a/c$b;

    invoke-direct {v7}, Lcom/fimi/soul/module/b/a/a/c$b;-><init>()V

    const-string v8, "nick"

    invoke-virtual {v0, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    iput-object v8, v7, Lcom/fimi/soul/module/b/a/a/c$b;->b:Ljava/lang/String;

    iput-object v1, v7, Lcom/fimi/soul/module/b/a/a/c$b;->d:Ljava/lang/String;

    iput-object v1, v7, Lcom/fimi/soul/module/b/a/a/c$b;->f:Ljava/lang/String;

    const-string v1, "tweet"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/HashMap;

    const-string v8, "text"

    invoke-virtual {v1, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v7, Lcom/fimi/soul/module/b/a/a/c$b;->c:Ljava/lang/String;

    :cond_8
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "head"

    invoke-virtual {v0, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/100"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v7, Lcom/fimi/soul/module/b/a/a/c$b;->e:Ljava/lang/String;

    iget-object v0, v7, Lcom/fimi/soul/module/b/a/a/c$b;->d:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_9
    move v3, v1

    goto/16 :goto_4

    :cond_a
    move v1, v3

    goto/16 :goto_3

    :cond_b
    const-string v0, "Facebook"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    const-string v0, "data"

    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_c
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    const-string v3, "id"

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_c

    new-instance v6, Lcom/fimi/soul/module/b/a/a/c$b;

    invoke-direct {v6}, Lcom/fimi/soul/module/b/a/a/c$b;-><init>()V

    iput-object v3, v6, Lcom/fimi/soul/module/b/a/a/c$b;->d:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "["

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v7, "]"

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v6, Lcom/fimi/soul/module/b/a/a/c$b;->f:Ljava/lang/String;

    const-string v3, "name"

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v6, Lcom/fimi/soul/module/b/a/a/c$b;->b:Ljava/lang/String;

    const-string v3, "picture"

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    if-eqz v0, :cond_d

    const-string v3, "data"

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    const-string v3, "url"

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v6, Lcom/fimi/soul/module/b/a/a/c$b;->e:Ljava/lang/String;

    :cond_d
    iget-object v0, v6, Lcom/fimi/soul/module/b/a/a/c$b;->d:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {p3, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_e
    const-string v0, "paging"

    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    const-string v1, "next"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    goto/16 :goto_3

    :cond_f
    const-string v0, "Twitter"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "users"

    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_10
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    const-string v6, "screen_name"

    invoke-virtual {v0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p3, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_10

    new-instance v7, Lcom/fimi/soul/module/b/a/a/c$b;

    invoke-direct {v7}, Lcom/fimi/soul/module/b/a/a/c$b;-><init>()V

    iput-object v6, v7, Lcom/fimi/soul/module/b/a/a/c$b;->d:Ljava/lang/String;

    iput-object v6, v7, Lcom/fimi/soul/module/b/a/a/c$b;->f:Ljava/lang/String;

    const-string v6, "name"

    invoke-virtual {v0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v7, Lcom/fimi/soul/module/b/a/a/c$b;->b:Ljava/lang/String;

    const-string v6, "description"

    invoke-virtual {v0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v7, Lcom/fimi/soul/module/b/a/a/c$b;->c:Ljava/lang/String;

    const-string v6, "profile_image_url"

    invoke-virtual {v0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v7, Lcom/fimi/soul/module/b/a/a/c$b;->e:Ljava/lang/String;

    iget-object v0, v7, Lcom/fimi/soul/module/b/a/a/c$b;->d:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-virtual {p3, v0, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7
.end method

.method private a()V
    .locals 4

    iget-boolean v0, p0, Lcom/fimi/soul/module/b/a/a/c;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/c;->c:Lcn/sharesdk/framework/Platform;

    const/16 v1, 0xf

    iget v2, p0, Lcom/fimi/soul/module/b/a/a/c;->e:I

    add-int/lit8 v2, v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcn/sharesdk/framework/Platform;->listFriend(IILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/fimi/soul/module/b/a/a/c;)Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/c;->f:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic c(Lcom/fimi/soul/module/b/a/a/c;)Lcom/fimi/soul/module/b/a/a/e;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/c;->a:Lcom/fimi/soul/module/b/a/a/e;

    return-object v0
.end method


# virtual methods
.method public a(I)Lcom/fimi/soul/module/b/a/a/c$b;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/c;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/module/b/a/a/c$b;

    return-object v0
.end method

.method public a(F)V
    .locals 3

    const/high16 v0, 0x3f800000    # 1.0f

    iput p1, p0, Lcom/fimi/soul/module/b/a/a/c;->i:F

    invoke-virtual {p0}, Lcom/fimi/soul/module/b/a/a/c;->getListView()Landroid/widget/ListView;

    move-result-object v1

    cmpg-float v2, p1, v0

    if-gez v2, :cond_0

    move p1, v0

    :cond_0
    float-to-int v0, p1

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->setDividerHeight(I)V

    return-void
.end method

.method public a(Landroid/widget/AdapterView$OnItemClickListener;)V
    .locals 1

    invoke-virtual {p0}, Lcom/fimi/soul/module/b/a/a/c;->getListView()Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    return-void
.end method

.method public a(Lcn/sharesdk/framework/Platform;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/b/a/a/c;->c:Lcn/sharesdk/framework/Platform;

    invoke-virtual {p1, p0}, Lcn/sharesdk/framework/Platform;->setPlatformActionListener(Lcn/sharesdk/framework/PlatformActionListener;)V

    return-void
.end method

.method public getCount()I
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/c;->f:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/c;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    goto :goto_0
.end method

.method public getFooterView()Landroid/view/View;
    .locals 2

    new-instance v0, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lcom/fimi/soul/module/b/a/a/c;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setMinimumHeight(I)V

    return-object v0
.end method

.method public getHeaderView()Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/c;->h:Lcom/fimi/soul/module/b/a/a/g;

    if-nez v0, :cond_0

    new-instance v0, Lcom/fimi/soul/module/b/a/a/g;

    invoke-virtual {p0}, Lcom/fimi/soul/module/b/a/a/c;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/fimi/soul/module/b/a/a/g;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/fimi/soul/module/b/a/a/c;->h:Lcom/fimi/soul/module/b/a/a/g;

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/c;->h:Lcom/fimi/soul/module/b/a/a/g;

    return-object v0
.end method

.method public synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/fimi/soul/module/b/a/a/c;->a(I)Lcom/fimi/soul/module/b/a/a/c$b;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    if-nez p2, :cond_1

    new-instance v1, Lcom/fimi/soul/module/b/a/a/d;

    invoke-virtual {p3}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    iget v2, p0, Lcom/fimi/soul/module/b/a/a/c;->i:F

    invoke-direct {v1, v0, v2}, Lcom/fimi/soul/module/b/a/a/d;-><init>(Landroid/content/Context;F)V

    :goto_0
    move-object v0, v1

    check-cast v0, Lcom/fimi/soul/module/b/a/a/d;

    invoke-virtual {p0, p1}, Lcom/fimi/soul/module/b/a/a/c;->a(I)Lcom/fimi/soul/module/b/a/a/c$b;

    move-result-object v2

    invoke-virtual {p0}, Lcom/fimi/soul/module/b/a/a/c;->isFling()Z

    move-result v3

    invoke-virtual {v0, v2, v3}, Lcom/fimi/soul/module/b/a/a/d;->a(Lcom/fimi/soul/module/b/a/a/c$b;Z)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/b/a/a/c;->getCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_0

    invoke-direct {p0}, Lcom/fimi/soul/module/b/a/a/c;->a()V

    :cond_0
    return-object v1

    :cond_1
    move-object v1, p2

    goto :goto_0
.end method

.method public onCancel(Lcn/sharesdk/framework/Platform;I)V
    .locals 2

    const/4 v0, 0x0

    new-instance v1, Lcom/fimi/soul/module/b/a/a/c$3;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/b/a/a/c$3;-><init>(Lcom/fimi/soul/module/b/a/a/c;)V

    invoke-static {v0, v1}, Lcom/mob/tools/utils/UIHandler;->sendEmptyMessage(ILandroid/os/Handler$Callback;)Z

    return-void
.end method

.method public onComplete(Lcn/sharesdk/framework/Platform;ILjava/util/HashMap;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/sharesdk/framework/Platform;",
            "I",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/c;->c:Lcn/sharesdk/framework/Platform;

    invoke-virtual {v0}, Lcn/sharesdk/framework/Platform;->getName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/c;->g:Ljava/util/HashMap;

    invoke-direct {p0, v0, p3, v1}, Lcom/fimi/soul/module/b/a/a/c;->a(Ljava/lang/String;Ljava/util/HashMap;Ljava/util/HashMap;)Lcom/fimi/soul/module/b/a/a/c$a;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    new-instance v1, Lcom/fimi/soul/module/b/a/a/c$1;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/b/a/a/c$1;-><init>(Lcom/fimi/soul/module/b/a/a/c;)V

    invoke-static {v0, v1}, Lcom/mob/tools/utils/UIHandler;->sendEmptyMessage(ILandroid/os/Handler$Callback;)Z

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-boolean v1, v0, Lcom/fimi/soul/module/b/a/a/c$a;->b:Z

    iput-boolean v1, p0, Lcom/fimi/soul/module/b/a/a/c;->b:Z

    iget-object v1, v0, Lcom/fimi/soul/module/b/a/a/c$a;->a:Ljava/util/ArrayList;

    if-eqz v1, :cond_0

    iget-object v1, v0, Lcom/fimi/soul/module/b/a/a/c$a;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_0

    iget v1, p0, Lcom/fimi/soul/module/b/a/a/c;->e:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/fimi/soul/module/b/a/a/c;->e:I

    new-instance v1, Landroid/os/Message;

    invoke-direct {v1}, Landroid/os/Message;-><init>()V

    const/4 v2, 0x1

    iput v2, v1, Landroid/os/Message;->what:I

    iget-object v2, v0, Lcom/fimi/soul/module/b/a/a/c$a;->a:Ljava/util/ArrayList;

    iput-object v2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    new-instance v2, Lcom/fimi/soul/module/b/a/a/c$2;

    invoke-direct {v2, p0, v0}, Lcom/fimi/soul/module/b/a/a/c$2;-><init>(Lcom/fimi/soul/module/b/a/a/c;Lcom/fimi/soul/module/b/a/a/c$a;)V

    invoke-static {v1, v2}, Lcom/mob/tools/utils/UIHandler;->sendMessage(Landroid/os/Message;Landroid/os/Handler$Callback;)Z

    goto :goto_0
.end method

.method public onError(Lcn/sharesdk/framework/Platform;ILjava/lang/Throwable;)V
    .locals 0

    invoke-virtual {p3}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method public onPullDown(I)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/c;->h:Lcom/fimi/soul/module/b/a/a/g;

    invoke-virtual {v0, p1}, Lcom/fimi/soul/module/b/a/a/g;->a(I)V

    return-void
.end method

.method public onRefresh()V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/c;->h:Lcom/fimi/soul/module/b/a/a/g;

    invoke-virtual {v0}, Lcom/fimi/soul/module/b/a/a/g;->a()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/fimi/soul/module/b/a/a/c;->e:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/module/b/a/a/c;->b:Z

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/c;->g:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    invoke-direct {p0}, Lcom/fimi/soul/module/b/a/a/c;->a()V

    return-void
.end method

.method public onReversed()V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/c;->h:Lcom/fimi/soul/module/b/a/a/g;

    invoke-virtual {v0}, Lcom/fimi/soul/module/b/a/a/g;->b()V

    return-void
.end method
